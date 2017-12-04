package com.test.dao;

import java.util.List;
import java.util.Map;

/**
 * ClassName:GenericDao
 * Function: 公共抽象Dao类
 * Date:     2017年7月4日下午1:06:00
 * @author   chenzz
 * @since    JDK 1.7
 */
public interface GenericDao<T, K> {
	/**
	 * 	根据参数获取列表数据
	 * @param params 参数
	 * @return 列表数据
	 */
	public List<T> list(Map<String, Object> params);

	/**
	 * 	根据key获取数据
	 * @param key 主键
	 * @return 单条数据
	 */
	public T get(K key);

	/**
	 * 	保存数据
	 * @param data 实体
	 * @return 变更数据行数
	 */
	public Integer save(T data);

	/**
	 * 	保存批量数据
	 * @param list 实体列表
	 * @return 变更数据行数
	 */
	public Integer saveBatch(List<T> list);

	/**
	 * 	更新数据
	 * @param data 实体
	 * @return 变更数据行数
	 */
	public Integer update(T data);

	/**
	 * 	根据参数更新数据
	 * @param params 参数
	 * @return 变更数据行数
	 */
	public Integer updateMultiple(Map<String, Object> params);

	/**
	 * 	根据key删除数据
	 * @param key 主键
	 * @return 变更数据行数
	 */
	public Integer delete(K key);

	/**
	 * 	批量删除数据
	 * @param keys 主键列表
	 * @return 变更数据行数
	 */
	public Integer deleteBatch(List<K> keys);

	/**
	 * 	删除所有数据
	 * @return 变更数据行数
	 */
	public Integer deleteAll();
}
