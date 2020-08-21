package com.capg.omts.login.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.omts.login.exception.InvalidUserException;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;
import com.capg.omts.login.util.TokenUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class AuthenticationServiceFilter extends ZuulFilter {

	@Autowired
	ILoginService loginService;

	@Autowired
	TokenUtil tokenUtil;

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		String uri = request.getRequestURI();
		if (uri.contains("/public/")) {
			return null;
		}
		String token = request.getHeader("Authorization");

		if (token != null) {
			UserCredentials credentials = tokenUtil.decode(token);
			UserCredentials userCredentials;

			userCredentials = loginService.authenticate(credentials);

			if (uri.contains("/admin/") && userCredentials.getUserType().equals("admin")) {
				return null;
			}

			if (uri.contains("/customer/") && userCredentials.getUserType().equals("customer")) {
				return null;
			}

		}
		context.setSendZuulResponse(false);
		context.setResponseStatusCode(401);
		context.setResponseBody("Un-Authorized");
		return null;

	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
