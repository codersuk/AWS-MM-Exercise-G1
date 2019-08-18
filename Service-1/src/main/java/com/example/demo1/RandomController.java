package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RandomController {

    /// returns a random number between 0 and 1000
    @GetMapping("/random")
    public Map<String, Object> greeting() {
        Map<String, Object> map = new HashMap<>();
        int randomValue = RandomNumberGenerator.generateNumber(1000);
        map.put("number", randomValue);
        return map;
    }
}
