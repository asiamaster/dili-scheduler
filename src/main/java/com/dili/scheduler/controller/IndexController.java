package com.dili.scheduler.controller;

import com.dili.uap.sdk.domain.UserTicket;
import com.dili.uap.sdk.session.SessionContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页控制器
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	/**
	 * 跳转到主页面
	 * @param modelMap
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/index.html", method = { RequestMethod.GET, RequestMethod.POST })
	public String index(ModelMap modelMap, HttpServletRequest request) {
		UserTicket userTicket = SessionContext.getSessionContext().getUserTicket();
		return "index";
	}



}
