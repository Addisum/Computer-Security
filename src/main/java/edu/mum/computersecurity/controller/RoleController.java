/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.computersecurity.controller;

import edu.mum.computersecurity.domain.Role;
import edu.mum.computersecurity.service.RoleService;
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
 * @author bayna_000
 */
@Controller

@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    private RoleService rs;

    @RequestMapping(value = "/list", method = RequestMethod.GET)

    public String listRole(Model model) {
        model.addAttribute("roles", rs.getAllRoles());
        return "role/list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPage(Role role) {
        return "role/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addRole(@Valid Role role, RedirectAttributes rAttributes, BindingResult re) {
        String view = "redirect:/role/list";
        if (!re.hasErrors()) {
            rs.addRole(role);
            rAttributes.addFlashAttribute("message", "Successfully added Role");
            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed add Role");
            return "role/add";
        }
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getDetails(@PathVariable int id, Model model) {
        model.addAttribute("role", rs.getRoleById(id));
        return "role/edit";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editRole(@Valid Role role, RedirectAttributes rAttributes, BindingResult re) {
        String view = "redirect:/role/list";
        if (!re.hasErrors()) {
            rs.updateRole(role);
            rAttributes.addFlashAttribute("message", "Successfully edited Role");
            return view;
        } else {
            rAttributes.addFlashAttribute("error", "Error failed edit Role");
            return "role/edit/{id}";
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteDetails(@PathVariable int id, Model model, RedirectAttributes rAttributes, Principal principal) {
        model.addAttribute("roleName", principal.getName());
        rs.removeRole(id);
        rAttributes.addFlashAttribute("message", "Successfully removed Role");
        return "redirect:/role/list";
    }

}
