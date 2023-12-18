package com.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controll {

	@RequestMapping(value = "save")
	@ResponseBody
	public String show() {
			return "Done....";
	}
}
