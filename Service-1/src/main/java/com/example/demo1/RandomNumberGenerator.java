package com.example.demo1;

public class RandomNumberGenerator {

    static public int generateNumber(int max) {
        int randomInt = (int)(max * Math.random());
        return randomInt;        
    }    
    
}