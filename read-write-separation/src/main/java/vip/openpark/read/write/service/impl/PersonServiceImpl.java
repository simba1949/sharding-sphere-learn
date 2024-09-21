package vip.openpark.read.write.service.impl;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vip.openpark.read.write.domain.PersonDO;
import vip.openpark.read.write.mapper.PersonDOMapper;
import vip.openpark.read.write.service.IPersonService;

/**
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 20:10
 */
@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class PersonServiceImpl implements IPersonService {
	private final PersonDOMapper personDOMapper;

	@Override
	@Transactional
	public void insert(PersonDO personDO) {
		int affectNum = personDOMapper.insertSelective(personDO);
		Validate.isTrue(1 == affectNum, "插入失败");
	}

	@Override
	public PersonDO getPersonById(Long id) {
		return personDOMapper.selectByPrimaryKey(id);
	}

	@Override
	@Transactional
	public PersonDO transactionalGetPersonById(Long id) {
		return personDOMapper.selectByPrimaryKey(id);
	}
}