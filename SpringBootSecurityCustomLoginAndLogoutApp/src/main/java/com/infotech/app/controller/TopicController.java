package com.infotech.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.app.service.TopicService;

@Controller
@RequestMapping("/user")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		    ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("custom-login");
		    return modelAndView;
    }	
	@GetMapping("/secure/topic-details")
	public ModelAndView getAllUserTopics() {
		    ModelAndView modelAndView = new ModelAndView();
		    modelAndView.addObject("usertopics", topicService.getAllTopics());
		    modelAndView.setViewName("topics");
		    return modelAndView;
    }
	@GetMapping("/error")
	public ModelAndView error() {
		    ModelAndView modelAndView = new ModelAndView();
		    String errorMessage= "You are not authorized for the requested data.";
		    modelAndView.addObject("errorMsg", errorMessage);
		    modelAndView.setViewName("error");
		    return modelAndView;
    }	
} 