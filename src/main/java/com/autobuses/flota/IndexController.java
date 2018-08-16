package com.autobuses.flota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends SpringBootServletInitializer {

	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}
}
