package com.example.demo1;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceOneApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test 
	public void hello() {
		
		//assert.fail(); // ("not implemented");
	    fail("not implemented yet");
	}

}
