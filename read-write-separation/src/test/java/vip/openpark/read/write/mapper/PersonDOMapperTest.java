package vip.openpark.read.write.mapper;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.read.write.domain.PersonDO;

/**
 * @author anthony
 * @version 2024/9/18
 * @since 2024/9/18 8:14
 */
@Slf4j
@SpringBootTest
public class PersonDOMapperTest {
	@Resource
	private PersonDOMapper personDOMapper;

	@Test
	public void insertTest(){
		PersonDO personDO = new PersonDO();
		personDO.setRealName("anthony");

		int affectedRows = personDOMapper.insert(personDO);
		log.info("affectedRows: {}", affectedRows);
		Assertions.assertEquals(1, affectedRows, "插入失败");
	}

	@Test
	public void selectByPrimaryKeyTest(){
		PersonDO personDO = personDOMapper.selectByPrimaryKey(1L);
		log.info("personDO: {}", personDO);
	}
}