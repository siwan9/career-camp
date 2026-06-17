package com.wemisson.career_camp.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wemisson.career_camp.domain.registratiion.dto.RegistrationRequest;

@Controller
public class ViewController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("request", RegistrationRequest.createEmpty());
		return "register";
	}

	@GetMapping("/lookup")
	public String lookup() {
		return "lookup";
	}

	@GetMapping("/admin/login")
	public String adminLogin() {
		return "admin/login";
	}

	@GetMapping("/admin/home")
	public String adminHome() {
		return "admin/home";
	}
	@GetMapping("/admin/recruitment-dashboard")
	public String adminRecruitmentDashboard() {
		return "admin/recruitment-dashboard";
	}
}
