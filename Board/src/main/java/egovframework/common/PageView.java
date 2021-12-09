package egovframework.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageView {
	
	@GetMapping({"/admin","/admin/index","/admin/home"})
	public String adminIndex() {
		return "admin/index";
	}
	@GetMapping({"/","/hyobin/index","/hyobin/home"})
	public String hyobinIndex() {
		return "hyobin/index";
	}
	
	@GetMapping("/{path1}/{path2}")
	public String page2(@PathVariable String path1, @PathVariable String path2) {
		return path1+"/"+path2;
	}
}
