package com.gl.userService_BonVoyage.util;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        String prefix = "U";
        String query = "SELECT MAX(user_id) as max_id FROM users";

        try (Connection connection = session.connection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {
                String lastId = rs.getString("max_id");
                if (lastId != null) {
                    int lastNumericId = Integer.parseInt(lastId.substring(1));
                    int newId = lastNumericId + 1;
                    return prefix + newId;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prefix + 101;
    }
}
