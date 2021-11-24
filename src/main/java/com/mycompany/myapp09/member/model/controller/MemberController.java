package com.mycompany.myapp09.member.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp09.member.model.service.MemberService;
import com.mycompany.myapp09.member.model.vo.Member;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam String id, Model model) {
		String result = "false";
		System.out.println(id);
		Member mvo = new Member(id);
		try {
			if(memberService.idCheck(mvo) == null) {
			System.out.println("중복 없음");
			model.addAttribute("result", "true");
			result = "true";
			return result;
			} else {
				System.out.println("중복 있음");
				result = "false";
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
