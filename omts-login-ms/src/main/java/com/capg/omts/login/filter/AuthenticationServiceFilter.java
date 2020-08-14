package com.capg.omts.login.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.omts.login.model.User;
import com.capg.omts.login.model.UserCredentials;
import com.capg.omts.login.service.ILoginService;
import com.capg.omts.login.util.TokenUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;



@Component
public class AuthenticationServiceFilter extends ZuulFilter{

	@Autowired
	ILoginService loginService;
	
	@Autowired
	TokenUtil tokenUtil;
	
	
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext context=RequestContext.getCurrentContext();
		HttpServletRequest request=context.getRequest();
		String requestUri=request.getRequestURI();
		String token =request.getHeader("Authorization");
		if(token != null)
		{
			UserCredentials credentials= tokenUtil.decode(token);
			//System.out.println(cred);
			UserCredentials userCredentials=loginService.authenticate(credentials);
			
			if(userCredentials.getUserType().equals("admin"))
			{
				return null;
			}
			
			if(userCredentials.getUserType().equals("customer"))
			{
				return null;
			}
		
			if(userCredentials.getUserType().equals("user"))
			{
				return null;
			}

			context.setSendZuulResponse(false);
			context.setResponseStatusCode(400);
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
