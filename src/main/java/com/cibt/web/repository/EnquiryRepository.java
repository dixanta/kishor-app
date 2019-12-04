/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.repository;

import com.cibt.web.entity.Enquiry;
import java.util.List;

/**
 *
 * @author apple
 */
public interface EnquiryRepository {
    List<Enquiry> findAll();
    int insert(Enquiry enquiry);
    Enquiry findById(int id);
}

