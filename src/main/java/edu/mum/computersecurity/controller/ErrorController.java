/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author bayna_000
 */
@Controller
public class ErrorController {

  @RequestMapping(value="/404")
    public String handle404() {
    	return "404";
    }

    @RequestMapping(value="/403")
    public String denied() {
    	return "403";
    }
    
    @RequestMapping(value="/500")
    public String SystemError(){
        return "500";
    }
}
