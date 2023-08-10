package com.facebookrest.service;

import java.util.List;
import java.util.logging.Logger;
import java.util.Optional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facebookrest.Dao.FacebookDAOInterface;
import com.facebookrest.entity.Facebookuser;
import com.facebookrest.expections.UserNotFoundException;

//import jdk.internal.org.jline.utils.Log;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Service
@Transactional
public class FacebookService implements FacebookServiceInterface {

	
	
	//public static Logger log = Logger.getLogger("FacebookService");
	
	
	
	
	
	@Autowired
	private FacebookDAOInterface fd;
	
	@Override
	public void createprofile(Facebookuser fu) {
		
		
	//	log.info("inside service class create profile method at"+new java.util.Date());
		fd.save(fu);
		
		//fd.insertRecord(fu);
		
	}

	/*@Override
	public List<Facebookuser> viewallserivce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facebookuser viewprofileservice(String email) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editprofile(Facebookuser fu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteprofile(String email) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public List<Facebookuser> viewallserivce() {
		
		return fd.findAll();
	}

	@Override
	public Facebookuser viewprofileservice(String email) throws UserNotFoundException {
		java.util.Optional<Facebookuser> ff = fd.findById(email);
		if(ff.isPresent()) {
			Facebookuser d=ff.get();
			return d;
		}
		else {
			throw new UserNotFoundException("user is not valid");
		}
		
	}

	@Override
	public void editprofile(Facebookuser fu) {
		fd.saveAndFlush(fu);
		
	}

	@Override
	public void deleteprofile(String email) {
		fd.deleteById(email);
		
	}
}
