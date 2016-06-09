package com.tiy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

@Controller
public class SampleController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(HttpSession session) throws Exception {
        return "home";
    }
}

