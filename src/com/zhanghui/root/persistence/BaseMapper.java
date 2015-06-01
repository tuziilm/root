package com.zhanghui.root.persistence;

import com.zhanghui.root.common.Paginator;
import com.zhanghui.root.domain.Id;

import java.util.List;

/**
 * ibatis�������Mapper�����ӿ�
 *
 */
public interface BaseMapper<T extends Id> {
	
    int deleteById(Integer id);
    
    int deleteByIds(int ids[]);

    int insert(T channel);

    List<T> selectAll();
    
    List<T> select(Paginator page);

    int count(Paginator page);

    T selectById(Integer id);
    
    int updateByIdSelective(T t);
    
    int updateById(T t);
}