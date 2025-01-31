package com.svtsygankov.spring.http.controller;

import com.svtsygankov.spring.dto.UserReadDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api/v1")
@SessionAttributes({"user"})
public class GreetingController {

    @GetMapping("/hello")
    public ModelAndView hello(ModelAndView modelAndView, HttpServletRequest request) {
        modelAndView.setViewName("greeting/hello");
        modelAndView.addObject("user", new UserReadDto(1l, "Ivan"));
        return modelAndView;
    }

    @GetMapping("/hello2/{id}")
    public ModelAndView hello2(ModelAndView modelAndView, HttpServletRequest request,
                              @RequestParam Integer age,
                              @RequestHeader String accept,
                              @CookieValue("JSESSIONID") String jsessionId,
                              @PathVariable("id") Integer id) {
        var ageParamValue = request.getParameter("age");
        var acceptHeder = request.getHeader("accept");
        var cookies = request.getCookies();
        modelAndView.setViewName("greeting/hello");
        return modelAndView;
    }

    @GetMapping("/bye")
    public ModelAndView bye(@SessionAttribute("user") UserReadDto user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting/bye");
        return modelAndView;
    }
}
