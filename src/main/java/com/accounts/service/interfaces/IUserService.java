package com.accounts.service.interfaces;

import com.accounts.valueobjects.UserVO;

public interface IUserService extends IService{
	public UserVO getUserByUsername(String username);
	public UserVO findByUserNameAndPassword(UserVO userVO);
}
