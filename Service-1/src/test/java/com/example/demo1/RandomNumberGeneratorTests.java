package com.example.demo1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RandomNumberGeneratorTests {

    @Test
    public void generateNumber__should__return_a_number_between_0_and_10()
    {
        // Arrange
        int max = 10;        

        // Act
        int number = RandomNumberGenerator.generateNumber(max);

        // Assert
        assertTrue("number is not in the range", number < max);
    }
}