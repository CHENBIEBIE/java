package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("patient")
public class PatientController {

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String home() {

        return "patient/list";

    }

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String list() {

        return "patient/home";

    }
    @RequestMapping(value = "new",method = RequestMethod.GET)
    public String save() {

        return "patient/new";

    }
}
