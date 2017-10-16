package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by buddhimah on 10/16/2017.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository daoImp;

    public StudentEntity getStudent(int id) {

        return this.daoImp.findOne(id);
    }

}
