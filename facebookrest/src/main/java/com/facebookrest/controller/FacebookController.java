package com.facebookrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebookrest.entity.Facebookuser;
import com.facebookrest.expections.UserNotFoundException;
import com.facebookrest.service.FacebookServiceInterface;

@RestController
@CrossOrigin("*")
public class FacebookController {
	
	@Autowired
	private FacebookServiceInterface fs;
	
	@GetMapping("viewprofile/{id}/{pass}")
	public Facebookuser View(@PathVariable("id") String email, @PathVariable("pass") String password)throws UserNotFoundException {
		
		try {
			Facebookuser ff = fs.viewprofileservice(email);
			return ff;
		}
		catch(UserNotFoundException uu){
			throw uu;
			
		}
	}
	@GetMapping("viewallprofile")
	public List<Facebookuser> Viewall() {
		
		return fs.viewallserivce();
	}
	
	@PostMapping("createprofile")
	public String create(@RequestBody Facebookuser fu) {
		fs.createprofile(fu);
		return "created.";
	}
	@PutMapping("editprofile/{id}")
	public String edit(@PathVariable("id") String email, @RequestBody Facebookuser fu) {
		fu.setEmail(email);
		fs.editprofile(fu);
		return "profile edited";
	}
	
	@DeleteMapping("deleteprofile/{id}")
	public String delete(@PathVariable("id") String email) {
		fs.deleteprofile(email);
		return "profile deleted";
	}
	
	

}
