/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.repository.impl;

import com.cibt.web.entity.Enquiry;
import com.cibt.web.repository.EnquiryRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author apple
 */
@Repository
public class EnquiryRepositoryImpl 
        implements EnquiryRepository {
    
    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Enquiry> findAll() {
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

    @Override
    public int insert(Enquiry enquiry) {
        String sql="insert into tbl_enquiries(first_name,last_name)"
                + "values(?,?)";
        return template.update(sql,new Object[]{
            enquiry.getFirstName(),enquiry.getLastName()
        });
    }
    
}
