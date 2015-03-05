package com.accounts.assembler;

import com.accounts.beans.IEntityBean;
import com.accounts.valueobjects.IValueObject;

public interface IAssembler {
    public IValueObject convertToValueObject(IEntityBean entity);
    public IEntityBean convertToEntityBean(IValueObject vo);
}
