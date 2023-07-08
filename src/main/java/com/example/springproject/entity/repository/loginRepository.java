package com.example.springproject.entity.repository;

import com.example.springproject.entity.Articlelogin;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface loginRepository extends CrudRepository<Articlelogin, Long> {

    //ArrayList<Articlelogin> findAll();
}
