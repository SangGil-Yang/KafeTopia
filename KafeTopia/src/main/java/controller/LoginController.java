package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.MemberDAO;
import model.domain.dto.Member;

@Controller
public class LoginController {
	
	//회원가입 처리
	@RequestMapping(value = "memberInsert.do", method = RequestMethod.POST)
	public String memberInsert(Member member) throws Exception {
		
		MemberDAO.addMember(member);
		
		return "redirect:index.html";
	}
	
	//로그인 처리
	@RequestMapping(value = "loginProcess.do", method = RequestMethod.POST)
	public String loginProcess(Member member, HttpSession session) throws Exception {
		
		Member loginUser = MemberDAO.findByUserIdAndPw(member.getId(), member.getPw());
		
		if(loginUser != null) {
			session.setAttribute("userLoginInfo", loginUser);
		}
		return "redirect:index.html";
	}
	
	
	
	

}
