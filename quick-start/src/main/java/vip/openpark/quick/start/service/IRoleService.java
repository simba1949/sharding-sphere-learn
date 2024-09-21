package vip.openpark.quick.start.service;

import vip.openpark.quick.start.domain.RoleDO;

/**
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 20:59
 */
public interface IRoleService {
	/**
	 * 根据主键删除数据
	 *
	 * @param id 主键
	 */
	void delete(Long id);

	/**
	 * 插入数据
	 *
	 * @param roleDO 数据
	 */
	void insert(RoleDO roleDO);
}