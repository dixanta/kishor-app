/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller.api;

import com.cibt.web.entity.Enquiry;
import com.cibt.web.repository.EnquiryRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    private EnquiryRepository repository;
   
    @GetMapping()
   public List<Enquiry> index(){
       return repository.findAll();
   }
   
   @GetMapping(value="/test")
   public ResponseEntity test(){
     return ResponseEntity.ok(
             repository.findAll()
     );  
   }
}
