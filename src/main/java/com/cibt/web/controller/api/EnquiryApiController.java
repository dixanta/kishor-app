/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller.api;

import com.cibt.web.entity.Enquiry;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author apple
 */
@RestController
@RequestMapping(value = "/api/enquiries")
public class EnquiryApiController {
    @Autowired
    private JdbcTemplate template;
   
    @GetMapping()
   public List<Enquiry> index(){
       String sql="select * from tbl_enquiries";
       return 
               template.query(sql, new RowMapper<Enquiry>() {
           @Override
           public Enquiry mapRow(ResultSet rs, int i) throws SQLException {
               return new Enquiry(
                       rs.getInt("id"),
                       rs.getString("first_name"), 
               rs.getString("last_name"));
           }
       });
   }
}
