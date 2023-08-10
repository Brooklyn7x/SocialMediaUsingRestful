package com.facebookrest.expections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FacebookControllerExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExpectionResponse handleusernotfound(UserNotFoundException ex, HttpServletRequest request) {
		
		ExpectionResponse ee = new ExpectionResponse();
		ee.setErrorMessage(ex.getMessage());
		ee.setRequestURL(request.getRequestURI());
		return ee;
		
	}
	
	
	
}
