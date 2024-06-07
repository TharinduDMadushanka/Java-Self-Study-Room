package model;

import db.DBConnection;
import dto.SchoolDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SchoolModel {
    private final Connection connection;

    public SchoolModel() throws SQLException, ClassNotFoundException {
        this.connection= DBConnection.getInstance().getConnection();
    }
    public String saveSchool(SchoolDto schoolDto) throws Exception {
        String sql="INSERT INTO student VALUES(?,?,?,?,?)";

        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,schoolDto.getId());
        statement.setString(2,schoolDto.getName());
        statement.setString(3,schoolDto.getAddress());
        statement.setString(4,schoolDto.getCity());
        statement.setInt(5,schoolDto.getContact());

        return statement.executeUpdate()>0?"success":"fail";
    }
}
