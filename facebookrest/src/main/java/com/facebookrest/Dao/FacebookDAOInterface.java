package com.facebookrest.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebookrest.entity.Facebookuser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<Facebookuser, String >{

	
}
