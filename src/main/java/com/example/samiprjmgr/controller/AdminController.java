//package com.example.samiprjmgr.controller;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AdminController {
//    @GetMapping("admin")
//    @PreAuthorize("hasRole('ROLE_Admin')")
//    public String Admin() {
//        return "This is Admin";
//    }
//
//    @GetMapping("home")
//    public String home(@AuthenticationPrincipal(expression = "claims['name']") String name){
//        return String.format("Hello %s to security.", name);
//    }
//
//}
