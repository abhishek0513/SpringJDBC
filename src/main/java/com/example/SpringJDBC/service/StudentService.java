package com.example.SpringJDBC.service;

import com.example.SpringJDBC.DAO.StudentRepo;
import com.example.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;
    public void addStudent(Student stud){
        repo.save(stud);
    }

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }


    public List<Student> getStudent(){
        return repo.findAll();
    }
}
