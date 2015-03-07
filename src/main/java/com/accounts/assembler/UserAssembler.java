package com.accounts.assembler;

import com.accounts.beans.IEntityBean;
import com.accounts.beans.User;
import com.accounts.valueobjects.IValueObject;
import com.accounts.valueobjects.UserVO;

public class UserAssembler implements IAssembler{
	
	private static UserAssembler instance;
	private UserAssembler(){}
	
	public static UserAssembler getInstance(){
		
		if(instance==null){
            synchronized (UserAssembler.class){
                if(instance==null){
                    instance = new UserAssembler();
                }
            }
        }
        return instance;
	}

	@Override
	public IValueObject convertToValueObject(IEntityBean entity) {
		UserVO vo = null;

        if(entity!=null){
            User userEntity = (User)entity;
            vo = new UserVO();
            
            vo.setId(userEntity.getId());
            vo.setRole(userEntity.getRole());
            vo.setUsername(userEntity.getUsername());
            vo.setPassword(userEntity.getPassword());

        }
        return vo;
	}

	@Override
	public IEntityBean convertToEntityBean(IValueObject vo) {
		User user = null;
		
		if(vo != null){
			UserVO userVO = (UserVO) vo;
			user = new User();
			
			user.setId(userVO.getId());
			user.setRole(userVO.getRole());
			user.setUsername(userVO.getUsername());
			user.setPassword(userVO.getPassword());
		}
		return user;
	}
	
	
}
