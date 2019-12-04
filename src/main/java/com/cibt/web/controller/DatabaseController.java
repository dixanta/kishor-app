/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

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
    private JdbcTemplate template;
    
    @GetMapping()
    @ResponseBody
    public String index(){
        String sql="create table tbl_enquiries(id serial primary key,"
                + "first_name varchar(200),last_name varchar(200))";
        int result=template.update(sql);
        return "<h1>table created " + result + "</h1>";
    }
    
    @GetMapping(value = "/add")
    @ResponseBody
    public String insert(){
        String sql="insert into tbl_enquiries("
                + "first_name,last_name) values('Dixanta','Shrestha')";
        int result=template.update(sql);
        return "<h1>table created " + result + "</h1>";
    }
   
    @GetMapping(value = "/test")
    @ResponseBody
    public List<String> test(){
        String sql="select * from tbl_enquiries";
        return template.query(sql, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int i) throws SQLException {
                return rs.getString("first_name") +
                        " " +
                        rs.getString("last_name");
            }
        });
    }
}
