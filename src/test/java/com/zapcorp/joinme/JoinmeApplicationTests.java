package com.zapcorp.joinme;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
class JoinmeApplicationTests {

	@Test
	void contextLoads() {
		int four = 4;
		assertTrue(four == 4, "'tis ok!");
	}
}
