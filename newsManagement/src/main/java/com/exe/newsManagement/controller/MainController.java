package com.exe.newsManagement.controller;

import com.exe.newsManagement.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    @Autowired(required=false)
    private MainService mainService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("listNews", mainService.getAllNews() );
        model.addAttribute("listCategory", mainService.getAllCategory());
        return "index";
    }

    @GetMapping("/article/{id}")
    public String viewArticle(@PathVariable(value="id") int id, Model model) {
        model.addAttribute("article", mainService.getNewsById(id));
        return ("view-article");
    }

}
