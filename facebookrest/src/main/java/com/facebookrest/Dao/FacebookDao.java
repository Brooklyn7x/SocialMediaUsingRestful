package com.facebookrest.Dao;

import java.util.List;

import javax.sql.DataSource;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.facebookrest.entity.Facebookuser;




/*@Repository
public class FacebookDao extends JdbcDaoSupport implements FacebookDAOInterface {

	
	@Autowired
	DataSource ds;
	
	@PostConstruct
	private void intialize() {
		setDataSource((javax.sql.DataSource) ds);
	}
	
	
	//@Override
	
	public void insertRecord(Facebookuser fu) {
		String query = "insert into facebookrestservice values(?,?,?)";
		getJdbcTemplate().update(query, new Object[] {fu.getName(),fu.getPassword(),fu.getEmail()});

	}

	//@Override
	public List<Facebookuser> viewAll() {
		// TODO Auto-generated method stub
		return null;
	}

}*/
