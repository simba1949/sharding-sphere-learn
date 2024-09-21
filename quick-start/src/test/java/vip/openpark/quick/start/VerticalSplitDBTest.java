package vip.openpark.quick.start;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.quick.start.domain.PersonDO;
import vip.openpark.quick.start.domain.RoleDO;
import vip.openpark.quick.start.service.IPersonService;
import vip.openpark.quick.start.service.IRoleService;

/**
 * 垂直分库
 *
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 21:11
 */
@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class VerticalSplitDBTest {
	private final IRoleService roleService;
	private final IPersonService personService;

	@Test
	public void personServiceInsertTest() {
		// 删除
		personService.delete(1L);

		// 插入
		PersonDO personDO = new PersonDO();
		personDO.setId(1L);
		personDO.setRealName("anthony");

		personService.insert(personDO);
	}

	@Test
	public void roleServiceInsertTest() {
		// 删除
		roleService.delete(10L);

		// 插入
		RoleDO roleDO = new RoleDO();
		roleDO.setId(10L);
		roleDO.setCode("architect");
		roleDO.setName("架构师");
		roleService.insert(roleDO);
	}
}