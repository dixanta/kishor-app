/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import com.cibt.web.entity.Enquiry;
import com.cibt.web.repository.EnquiryRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apple
 */
@Controller
@RequestMapping(value = "/database")
public class DatabaseController {
    @Autowired
    private EnquiryRepository repository;
    
    @GetMapping()
    @ResponseBody
    public String index(){
        repository
                .insert(
                        new Enquiry(0,"Ramesh", "Shrestha"));
        repository
                .insert(
                        new Enquiry(0,"Ramesh", "Kumar"));
        return "<h1>Record added</h1>";
    }
}
