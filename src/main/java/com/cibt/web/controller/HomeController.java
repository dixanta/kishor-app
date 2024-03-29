/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController{
    @GetMapping
    public String index(Model model){
        model.addAttribute("name", "Creators Institute");
        model.addAttribute("colors", 
                new String[]{"blue","aqua","orange","green","red","purple"});
       return "index"; 
    }
    
    @GetMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "<h1>This is test method of spring</h1>";
    }
    
    @GetMapping(value = "/about")
    @ResponseBody
    public String about(){
        return "<h1>This is About us page</h1>";
    }
}
