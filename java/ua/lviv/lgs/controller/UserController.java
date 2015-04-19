package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import ua.lviv.lgs.model.User;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.UserServiceImpl;

@Controller
public class UserController {
@Autowired
private UserService service;

@RequestMapping(value = "/user/add", method = RequestMethod.POST)
public String addAuthor(
		@ModelAttribute("user") User a) {
	service.saveUser(a);
	return "redirect:/user";
}
}
