package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RandomController {

    @GetMapping("/random")
    public Map<String, String> greeting(){
        Map<String, String> map = new HashMap<>();
        map.put("number", "124");
        return map;
    }
}
