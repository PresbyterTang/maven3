package com.nsu.tly.service;

import java.util.List;

import com.nsu.tly.entity.TUser;

public interface UserService {
	public int addUser(TUser user);
	public List<TUser> findAllUser();

}
