package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RandomController {

    @GetMapping("/random")
    public Map<String, Object> greeting(){
        Map<String, Object> map = new HashMap<>();

        int randomValue = createRandom(0, 1000);

        map.put("number", randomValue);
        return map;
    }

    private int createRandom(int min, int max) {
        int randomInt = (int)(max * Math.random());
        return randomInt;
    }
}
