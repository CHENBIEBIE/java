package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("install")
public class InstallController {

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list() {

        return "install/list";

    }


    @RequestMapping(value = "new",method = RequestMethod.GET)
    public String save() {

        return "install/new";

    }

    @RequestMapping(value = "disease",method = RequestMethod.GET)
    public String disease() {

        return "install/disease";

    }

    @RequestMapping(value = "role",method = RequestMethod.GET)
    public String role() {

        return "install/role";

    }
}
