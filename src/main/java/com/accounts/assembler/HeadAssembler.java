package com.accounts.assembler;

import com.accounts.beans.Head;
import com.accounts.beans.IEntityBean;
import com.accounts.valueobjects.HeadVO;
import com.accounts.valueobjects.IValueObject;


public class HeadAssembler implements IAssembler{
	
	private static HeadAssembler instance;
    private HeadAssembler(){}

    public static HeadAssembler getInstance(){
        if(instance==null){
            synchronized (HeadAssembler.class){
                if(instance==null){
                    instance = new HeadAssembler();
                }
            }
        }
        return instance;
    }

	@Override
	public IValueObject convertToValueObject(IEntityBean entity) {
		HeadVO vo = null;

        if(entity!=null){
            Head headEntity = (Head)entity;
            vo = new HeadVO();
            
            vo.setId(headEntity.getId());
            vo.setName(headEntity.getName());
            vo.setDescription(headEntity.getDescription());
            vo.setParentId(headEntity.getParentId());
            vo.setStatus(headEntity.getStatus());
            vo.setCreatedby(headEntity.getCreatedby());
            vo.setDatecreated(headEntity.getDatecreated());
        }
        return vo;
	}

	@Override
	public IEntityBean convertToEntityBean(IValueObject vo) {
		Head head = null;
		
		if(vo != null){
			HeadVO headVO = (HeadVO) vo;
			head = new Head();
			
			head.setId(headVO.getId());
			head.setName(headVO.getName());
			head.setName(headVO.getName());
			head.setDescription(headVO.getDescription());
			head.setParentId(headVO.getParentId());
			head.setStatus(headVO.getStatus());
			head.setCreatedby(headVO.getCreatedby());
			head.setDatecreated(headVO.getDatecreated());
		}
		return head;
	}


}
