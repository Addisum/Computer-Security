/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.controller;

import edu.mum.computersecurity.domain.Employee;
import edu.mum.computersecurity.service.impl.EmployeeService;
import java.security.Principal;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author zeray
 */
@Controller

@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService es;

    @RequestMapping(value = "/list", method = RequestMethod.GET)

    public String ListEmployee(Model model) {
        model.addAttribute("employees", es.getEmployee());
        return "employee/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addpage(Employee employee) {
        return "employee/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEmployee(@Valid Employee employe, RedirectAttributes rAttributes, BindingResult re) {
        String view = "redirect:/employee/list";
        if (!re.hasErrors()) {
            es.creatEmployee(employe);
            rAttributes.addFlashAttribute("message", "Successfully added Employee");
            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed add Employee");
            return "employee/add";
        }
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getDetails(@PathVariable int id, Model model) {
        model.addAttribute("employee", es.find(id));
        return "employee/edit";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editEmployee(@Valid Employee employee, RedirectAttributes rAttributes, BindingResult re) {
        String view = "redirect:/employee/list";
        if (!re.hasErrors()) {
            es.update(employee);
            rAttributes.addFlashAttribute("message", "Successfully edited Employee");
            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed edit Employee");
            return "employee/edit/{id}";
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteDetails(@PathVariable int id, Model model, RedirectAttributes rAttributes, Principal principal) {
        model.addAttribute("username", principal.getName());
        es.delete(id);
        rAttributes.addFlashAttribute("message", "Successfully removed Employee");
        return "redirect:/employee/list";
    }
//
//    @RequestMapping(value = "/assignrole", method = RequestMethod.GET)
//    public String getAssignRole(Model model, Principal principal) {
//        model.addAttribute("username", principal.getName());
//        model.addAttribute("employees", employeeService.getEmployees());
//        model.addAttribute("roles", employeeService.getRoles());
//        return "employee/assignrole";
//
//    }
//
//    @RequestMapping(value = "/assignrole", method = RequestMethod.POST)
//    @ResponseBody
//    public String updateAssignRole(HttpServletRequest request) {
//        int empId = 0;
//        String jsonString = request.getParameter("empId");
//
//        return "working " + jsonString;
//    }

}
