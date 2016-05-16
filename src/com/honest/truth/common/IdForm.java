package com.honest.truth.common;

import com.honest.truth.domain.Id;

/**
 * ����ID�ı�����
 *
 */
public abstract class IdForm<T extends Id> {
    protected Integer id;

    public abstract T newObj();
    public abstract void populateObj(T obj);

    public T toObj(){
        T t= newObj();
        t.setId(id);
        populateObj(t);
        return t;
    }
    
    public boolean isModified(){
    	return id != null && id > 0;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
