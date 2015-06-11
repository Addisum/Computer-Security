/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.controller;

import edu.mum.computersecurity.domain.Employee;
//import edu.mum.computersecurity.domain.ProductBacklog;
import edu.mum.computersecurity.domain.Role;
import edu.mum.computersecurity.domain.User;
import edu.mum.computersecurity.domain.UserRoles;
import edu.mum.computersecurity.service.RoleService;
import edu.mum.computersecurity.service.UserRoleService;
import edu.mum.computersecurity.service.impl.EmployeeService;
import edu.mum.computersecurity.service.impl.UserServiceImpl;
import static java.lang.Integer.parseInt;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import static javax.xml.bind.DatatypeConverter.parseInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author zeray
 */
@Controller
@RequestMapping(value = "/systemUser")
public class UserController {

    @Autowired
    private UserServiceImpl us;

    @Autowired
    private EmployeeService es;

    @Autowired
    private RoleService rs;

    @Autowired
    private UserRoleService urs;

    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ListUsers(Model model) {
        model.addAttribute("systemUsers", us.getAllUsers());
        return "systemUser/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getDetailUser(@ModelAttribute("userCommand") User user) {
        List<Employee> list = es.getEmployee();
        List<Role> listRole = rs.getAllRoles();
        //return back to index.jsp
        ModelAndView model = new ModelAndView("systemUser/add");
        model.addObject("employeeList", list);
        model.addObject("roles", listRole);
        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String createUser(@RequestParam(value = "roles") String[] roleList, @ModelAttribute(value = "userCommand") User user, BindingResult re, RedirectAttributes rAttributes, Model model) {
        System.out.println("YAACHVAA SDA");

        String view = "redirect:/systemUser/list";

        if (!re.hasErrors()) {
            rAttributes.addFlashAttribute("message", "Successfully added User");
            us.addUser(user);
        for (String role : roleList) {
            System.out.println("There is working:" + role);
        }
            
            for (String role : roleList) {
                System.out.println("here is working:" + role);
                UserRoles tempUserRoles = new UserRoles();
                Role temp = new Role();
                temp.setRoleId(parseInt(role));
                tempUserRoles.setRole(temp);
                tempUserRoles.setUser(user);
                urs.addUserRole(tempUserRoles);
                tempUserRoles =  null;
            }

            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed add User");
            return "systemUser/add";
        }
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable int id, Model model) {
        model.addAttribute("user", us.getUserById(id));
        return "systemUser/edit";

    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateUser(@Valid User user, RedirectAttributes rAttributes, BindingResult re) {
        String view = "redirect:/systemUser/list";
        if (!re.hasErrors()) {
            us.updateUser(user);
            rAttributes.addFlashAttribute("message", "Successfully edited User");
            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed edit User");
            return "systemUser/edit/{id}";
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteDetails(@PathVariable int id, Model model, RedirectAttributes rAttributes, Principal principal) {
        model.addAttribute("username", principal.getName());
        us.removeUser(id);
        rAttributes.addFlashAttribute("message", "Successfully removed User");
        return "redirect:/systemUser/list";
    }
}
