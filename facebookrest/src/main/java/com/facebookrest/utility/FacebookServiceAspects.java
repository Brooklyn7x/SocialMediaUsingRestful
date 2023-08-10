package com.facebookrest.utility;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
//import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.facebookrest.entity.Facebookuser;


//import jdk.internal.org.jline.utils.Log;

/*@Aspect
@Component
public class FacebookServiceAspects {
	public static Logger log=Logger.getLogger("FacebookService");
	
	@Before(value="execution(* com.facebookrest.service.FacebookService.*(..)) and args(fuser)")
	public void beforeExecution(JoinPoint jj,Facebookuser fuser) {
		log.info("before execution of "+ jj.getSignature());
		log.info("creating new Facebook user profile "+ fuser.getEmail());
	}
	
	//@Before(value="execution(* com.facebookrest.service.FacebookService.*(..))and args(fuser)")
	//public void beforeExecution(JoinPoint jj,Facebookuser fuser) {
	//	log.info("before execution of "+ jj.getSignature());
	//	log.info("creating new Facebook user profile "+ fuser.getEmail());
	//}
	
	
	
	@After(value="execution(* com.facebookrest.service.FacebookService.*(..))and args(fuser")
	public void afterExecution(JoinPoint jj,Facebookuser fuser) {
		log.info("after execution of "+ jj.getSignature());
		log.info("after creating new Facebook user profile "+ fuser.getEmail());
	}
	

}*/
