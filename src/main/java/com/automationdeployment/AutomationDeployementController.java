package com.automationdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myName")
public class AutomationDeployementController {
	@GetMapping(value = "/is/{name}")
	public String getName(String name) {
		return "I Love You" + name;
	}
}
