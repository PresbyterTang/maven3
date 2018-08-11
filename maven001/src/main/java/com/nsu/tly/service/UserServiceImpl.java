package com.nsu.tly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsu.tly.dao.TUserDAO;
import com.nsu.tly.entity.TUser;


@Service("userServcie")
public class UserServiceImpl implements UserService {
	
	
	
	
	@Autowired
	private TUserDAO userDao;

	@Override
	public int addUser(TUser user) {
		this.userDao.save(user);
		return 0;
	}

	
	public List<TUser> findAllUser() {
		return this.userDao.findAll();
	}

}
