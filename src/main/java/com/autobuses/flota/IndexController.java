package com.autobuses.flota;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class IndexController {

	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}

}
