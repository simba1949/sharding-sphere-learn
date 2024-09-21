package vip.openpark.read.write.service;

import vip.openpark.read.write.domain.PersonDO;

/**
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 20:10
 */
public interface IPersonService {
	/**
	 * 插入数据
	 *
	 * @param personDO 数据
	 */
	void insert(PersonDO personDO);

	/**
	 * 根据主键查询数据
	 *
	 * @param id 主键
	 * @return 数据
	 */
	PersonDO getPersonById(Long id);

	/**
	 * 根据主键查询数据，使用事务
	 *
	 * @param id 主键
	 * @return 数据
	 */
	PersonDO transactionalGetPersonById(Long id);
}