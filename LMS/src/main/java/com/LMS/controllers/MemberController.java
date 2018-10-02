package com.LMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.LMS.data_access.MemberDao;
import com.LMS.models.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberDao memberDao;
	
	@GetMapping("/member")
	public String member(Model model)
	{
		Member emptyMember = new Member();
		model.addAttribute("member", emptyMember);
		return "member";
	}

	@PostMapping("/member")
	public String addMember(@ModelAttribute("member")Member member) {
		member = memberDao.save(member);
		return "member";
	}
}	
