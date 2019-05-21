/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.bit.cse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Shell
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping
    public ModelAndView home() {
        return new ModelAndView("index");
    }
}
