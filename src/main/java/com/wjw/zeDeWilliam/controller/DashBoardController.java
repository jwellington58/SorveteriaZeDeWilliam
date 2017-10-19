package com.wjw.zeDeWilliam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wjw.zeDeWilliam.model.Picole;
import com.wjw.zeDeWilliam.repository.Picoles;

@Controller
@RequestMapping("/dashboard")
public class DashBoardController {
	
	@RequestMapping
	public String dashBoard() {
		return "DashBoard";
	}
	
}
