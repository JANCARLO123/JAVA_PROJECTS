package org.antuansoft.mvc;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Log4jtest {

	Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping(value = "/log4jtest")
	public ModelAndView log4jtest(HttpServletRequest request) {
		
		
		ModelAndView model = new ModelAndView("log4jtest");
				
		logger.debug("debug");
		logger.error("error");
		logger.info("info");
		logger.fatal("fatal");
		logger.trace("trace");
		
		
		return model;
	}
	

}
