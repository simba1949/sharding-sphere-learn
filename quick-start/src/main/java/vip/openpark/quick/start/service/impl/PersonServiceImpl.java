package vip.openpark.quick.start.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import vip.openpark.quick.start.domain.PersonDO;
import vip.openpark.quick.start.mapper.PersonDOMapper;
import vip.openpark.quick.start.service.IPersonService;

/**
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 20:10
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class PersonServiceImpl implements IPersonService {
	private final PersonDOMapper personDOMapper;

	@Override
	public void delete(Long id) {
		personDOMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public void insert(PersonDO personDO) {
		int affectNum = personDOMapper.insertSelective(personDO);
		Assert.isTrue(1 == affectNum, "插入失败");
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