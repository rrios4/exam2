package com.CIS3368.exam2.api;

import com.CIS3368.exam2.service.virusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
//Finally we have to create the controller in a api package that handles the request and maps them to file
@Controller
public class virusController {
    @Autowired
    private virusService VirusService;

    @GetMapping("/") //All user has to do is type localhost:8088
    public String init(HttpServletRequest req){
        //This gets the information of the virus from the service package in a http request and this will be used to call the values of the virus for the jsp file.
        req.setAttribute("viruses", VirusService.findAllViruses());
        return "index";
    }
}
