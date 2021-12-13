package egovframework.project.admin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public String test() {
		
		logger.info("서비스입니다!!");
		
		return "";
	}
}
