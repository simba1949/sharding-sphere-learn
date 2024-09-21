package vip.openpark.quick.start;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.quick.start.domain.PersonDO;
import vip.openpark.quick.start.service.IPersonService;

/**
 * 水平分表
 *
 * @author anthony
 * @version 2024/9/21
 * @since 2024/9/21 21:47
 */
@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class HorizontalSplitDBSpitTableTest {
	private final IPersonService personService;

	@Test
	public void insertTest() {
		// db=0,table=0
		PersonDO p00 = new PersonDO();
		p00.setId((long) 2);
		p00.setRealName("anthony-0-0");
		p00.setSex((byte) 0);

		// db=0,table=1
		PersonDO p01 = new PersonDO();
		p01.setId((long) 1);
		p01.setRealName("anthony-0-1");
		p01.setSex((byte) 0);

		// db=1,table=0
		PersonDO p10 = new PersonDO();
		p10.setId((long) 4);
		p10.setRealName("anthony-1-0");
		p10.setSex((byte) 1);

		// db=1,table=1
		PersonDO p11 = new PersonDO();
		p11.setId((long) 3);
		p11.setRealName("anthony-1-1");
		p11.setSex((byte) 1);

		personService.insert(p00);
		personService.insert(p01);
		personService.insert(p10);
		personService.insert(p11);
	}
}