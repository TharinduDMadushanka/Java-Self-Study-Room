package model;

import db.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class SchoolModel {
    private final Connection connection;

    public SchoolModel() throws SQLException, ClassNotFoundException {
        this.connection= DBConnection.getInstance().getConnection();
    }
}
