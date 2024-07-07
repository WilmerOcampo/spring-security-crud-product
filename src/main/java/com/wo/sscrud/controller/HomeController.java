package com.wo.sscrud.controller;

import com.wo.sscrud.security.CustomUserDetails;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        CustomUserDetails customUserDetails = (CustomUserDetails) userDetails;
        session.setAttribute("name", customUserDetails.getName() + " " + customUserDetails.getLastName());
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
