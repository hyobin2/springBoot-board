package egovframework.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminInterceptor implements HandlerInterceptor {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hanObject) throws Exception{
		/*
		 * 컨트롤러가 실행되기전에 실행되는 부분
		 * */
		logger.info("인터셉터 시작!");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object hanObject, ModelAndView mv) throws Exception{
		/*
		 * 컨트롤러가 실행되고 난 후 실행되는 부분
		 * */
		logger.info("인터셉터 끝!");
	}
	
}
