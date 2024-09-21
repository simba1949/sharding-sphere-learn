package vip.openpark.quick.start.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import vip.openpark.quick.start.domain.RoleDO;
import vip.openpark.quick.start.mapper.RoleDOMapper;
import vip.openpark.quick.start.service.IRoleService;

/**
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 21:00
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class RoleServiceImpl implements IRoleService {
	private final RoleDOMapper roleDOMapper;

	@Override
	public void delete(Long id) {
		roleDOMapper.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional
	public void insert(RoleDO roleDO) {
		int affectNum = roleDOMapper.insertSelective(roleDO);
		Assert.isTrue(1 == affectNum, "插入失败");
	}
}