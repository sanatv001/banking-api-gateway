package com.sv.api_gateway.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @RequestMapping(value = "/account", method = {RequestMethod.GET, RequestMethod.POST})
    public String accountServiceFallback(){
        return "Account Service is currently unavailable. Please try again later.";
    }
}
