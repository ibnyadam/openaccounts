package com.accounts.assembler;

import com.accounts.beans.IEntityBean;
import com.accounts.beans.Role;
import com.accounts.valueobjects.IValueObject;
import com.accounts.valueobjects.RoleVO;

public class RoleAssembler implements IAssembler{
	
	private static RoleAssembler instance;
	private RoleAssembler(){}
	
	public static RoleAssembler getInstance(){
		
		if(instance==null){
            synchronized (RoleAssembler.class){
                if(instance==null){
                    instance = new RoleAssembler();
                }
            }
        }
        return instance;
	}

	@Override
	public IValueObject convertToValueObject(IEntityBean entity) {
		RoleVO vo = null;

        if(entity!=null){
            Role roleEntity = (Role)entity;
            vo = new RoleVO();
            
            vo.setId(roleEntity.getId());
            vo.setRole(roleEntity.getRole());

        }
        return vo;
	}

	@Override
	public IEntityBean convertToEntityBean(IValueObject vo) {
		Role role = null;
		
		if(vo != null){
			RoleVO roleVO = (RoleVO) vo;
			role = new Role();
			
			role.setId(roleVO.getId());
			role.setRole(roleVO.getRole());
		}
		return role;
	}
}
