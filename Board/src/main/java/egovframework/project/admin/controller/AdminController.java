package egovframework.project.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.project.admin.service.TestService;

@RequestMapping("/admin")
@Controller
public class AdminController {
	@Autowired
	private TestService ts;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/test")
	public String test() {
		logger.info("테스트 시작!!!");
		logger.info("현위치 컨트롤러!!");
		ts.test();
		return "admin/index";
	}
}
