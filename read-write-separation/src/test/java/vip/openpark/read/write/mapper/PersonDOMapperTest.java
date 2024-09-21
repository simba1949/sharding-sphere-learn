package vip.openpark.read.write.mapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import vip.openpark.read.write.domain.PersonDO;
import vip.openpark.read.write.service.IPersonService;

/**
 * @author anthony
 * @version 2024/9/18
 * @since 2024/9/18 8:14
 */
@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class PersonDOMapperTest {
	private final IPersonService personService;

	@Test
	@Sql(statements = {"DELETE FROM person WHERE id = 1"})
	public void insertTest() {
		PersonDO personDO = new PersonDO();
		personDO.setId(1L);
		personDO.setRealName("anthony");

		personService.insert(personDO);
	}

	@Test
	@Sql(statements = {"INSERT INTO person (id, real_name) VALUES (1, 'anthony') ON DUPLICATE KEY UPDATE real_name = VALUES(real_name);"})
	public void selectByPrimaryKeyTest() {
		// 模拟多次请求，读取数据是否进行负载均衡
		for (int i = 0; i < 5; i++) {
			PersonDO personDO = personService.getPersonById(1L);
			log.info("personDO: {}", personDO);
			Assertions.assertEquals("anthony", personDO.getRealName(), "查询失败");
		}
	}

	@Test
	@Sql(statements = {"INSERT INTO person (id, real_name) VALUES (1, 'anthony') ON DUPLICATE KEY UPDATE real_name = VALUES(real_name);"})
	public void transactionalGetPersonByIdTest(){
		for (int i = 0; i < 6; i++) {
			PersonDO personDO = personService.transactionalGetPersonById(1L);
			log.info("personDO: {}", personDO);
			Assertions.assertEquals("anthony", personDO.getRealName(), "查询失败");
		}
	}
}