package controller;

import dto.SchoolDto;
import model.SchoolModel;

import java.sql.SQLException;

public class SchoolController {
    private SchoolModel schoolModel;

    public SchoolController() throws SQLException, ClassNotFoundException {
        this.schoolModel=new SchoolModel();
    }
    public String saveSchool(SchoolDto schoolDto) throws Exception {
        String resp=schoolModel.saveSchool(schoolDto);
        return resp;
    }
}
