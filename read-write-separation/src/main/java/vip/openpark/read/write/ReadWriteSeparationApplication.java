package vip.openpark.read.write;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author anthony
 * @version 2024/9/18
 * @since 2024/9/18 6:53
 */
@SpringBootApplication
@MapperScan(basePackages = "vip.openpark.read.write.mapper")
public class ReadWriteSeparationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReadWriteSeparationApplication.class, args);
	}
}