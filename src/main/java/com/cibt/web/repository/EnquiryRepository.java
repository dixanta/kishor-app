/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.repository;

import com.cibt.web.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author apple
 */
@Repository
public interface EnquiryRepository 
    extends JpaRepository<Enquiry, Integer>{
    
}

