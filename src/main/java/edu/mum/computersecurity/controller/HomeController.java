package edu.mum.computersecurity.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(SecurityContextHolderAwareRequestWrapper request) {
        boolean b = request.isUserInRole("ROLE_ADMIN");
        System.out.println("ROLE_ADMIN=" + b);

        boolean c = request.isUserInRole("ROLE_USER");
        System.out.println("ROLE_USER=" + c);
        return "home";
    }

    @RequestMapping(value = "/addProductBacklog", method = RequestMethod.GET)
    public String adPBPage(Model model) {
        
        return "pbadd";
    }
}
