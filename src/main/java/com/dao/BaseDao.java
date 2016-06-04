package com.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	// 根据ID加载实体
	T getById(Class<T> entityClazz , Serializable id);
	// 保存实体
	Serializable save(T entity);
	// 更新实体
	void update(T entity);
	// 删除实体
	void delete(T entity);
	// 根据ID删除实体
	void deleteById(Class<T> entityClazz , Serializable id);
	// 获取所有有实体
	List<T> findAll(Class<T> entityClazz);
	// 获取实体总数
	long findCount(Class<T> entityClazz);
	//根据名字加载实体
	List<T> getByName(Class<T> entityClazz,String name);
}
