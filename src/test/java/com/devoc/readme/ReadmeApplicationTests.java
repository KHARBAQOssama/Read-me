package com.devoc.readme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("test")
@Import(TestSecurityConfig.class)
class ReadmeApplicationTests {
	@Test
	void contextLoads() {
	}

}
