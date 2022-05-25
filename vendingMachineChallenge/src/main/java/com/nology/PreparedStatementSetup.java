package com.nology;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetup {


    /**
     * Perform any actions before calling the executeUpdate() on the {@link PreparedStatement}.
     * @param statement
     * @throws SQLException
     */
    void beforeExecution(PreparedStatement statement) throws SQLException;
}
