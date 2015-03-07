package com.accounts.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accounts.assembler.RoleAssembler;
import com.accounts.beans.Role;
import com.accounts.repository.RoleRepository;
import com.accounts.service.interfaces.IRoleService;
import com.accounts.valueobjects.RoleVO;

@Service
public class RoleService implements IRoleService{

	@Resource
	RoleRepository roleRepository;
	
	@Override
	public RoleVO getRole(int id) {
		Role role = roleRepository.findOne((long) id);
		RoleVO roleVO = (RoleVO) RoleAssembler.getInstance().convertToValueObject(role);
		return roleVO;
	}

}
