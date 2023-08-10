package com.facebookrest.service;

import java.util.List;

import com.facebookrest.entity.Facebookuser;
import com.facebookrest.expections.UserNotFoundException;

public interface FacebookServiceInterface {

	void createprofile(Facebookuser fu);

	List<Facebookuser> viewallserivce();

	Facebookuser viewprofileservice(String email) throws UserNotFoundException;

	void editprofile(Facebookuser fu);

	void deleteprofile(String email);

}
