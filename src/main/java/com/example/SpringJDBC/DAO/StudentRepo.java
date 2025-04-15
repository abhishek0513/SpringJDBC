package com.example.SpringJDBC.DAO;

import com.example.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public void save(Student s) {
        String sql = "insert into student (roll_no, name, marks) values(? ? ?)";
        int rows = jdbc.update(sql, s.getRoll_no(), s.getName(), s.getMarks());
        System.out.println("Rows affected : " + rows);
    }


    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        return studentList;
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
