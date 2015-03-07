package com.accounts.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accounts.assembler.UserAssembler;
import com.accounts.beans.User;
import com.accounts.repository.UserRepository;
import com.accounts.service.interfaces.IUserService;
import com.accounts.valueobjects.UserVO;

@Service
public class UserService implements IUserService{

	@Resource
	UserRepository userRepository;
	
	@Override
	public UserVO getUserByUsername(String username) {
		User user = userRepository.findByUsername(username);
		UserVO userVO = (UserVO) UserAssembler.getInstance().convertToValueObject(user);
		return userVO;
	}

	@Override
	public UserVO findByUserNameAndPassword(UserVO userVO) {
		User user = userRepository.findByUsernameAndPassword(userVO.getUsername(), userVO.getPassword());
        return (UserVO) UserAssembler.getInstance().convertToValueObject(user);
	}

}
