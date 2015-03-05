package com.accounts.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accounts.assembler.HeadAssembler;
import com.accounts.beans.Head;
import com.accounts.repository.HeadRepository;
import com.accounts.service.interfaces.IHeadService;
import com.accounts.valueobjects.HeadVO;

@Service
public class HeadService implements IHeadService{

	@Resource
	private HeadRepository headRepository;
	
	@Override
	@Transactional
	public HeadVO save(HeadVO headVO) {
		Head head = (Head) HeadAssembler.getInstance().convertToEntityBean(headVO);
		head = headRepository.saveAndFlush(head);
		HeadVO vo = (HeadVO) HeadAssembler.getInstance().convertToValueObject(head);
		return vo;
	}

}
