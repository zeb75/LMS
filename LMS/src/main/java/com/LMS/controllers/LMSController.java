package com.LMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.LMS.data_access.AllDao;

@Controller
public class LMSController {
@Autowired
private AllDao allDao;

	
@GetMapping("/index")
public String index()
{
return "index";
}
}
