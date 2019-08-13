package com.ex.Gret;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;



    @RestController
    @RequestMapping("hello")
    public class GreetingController {
        private int counter = 1;
        private String str="Hello,World!";
        private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
            add(new HashMap<String, String>() {{
                put("id", "1");
                put("text", "Hello World");
            }});
        }};

        @GetMapping
        /**public List<Map<String, String>> list() {
            return messages;
        }**/
        public String list() {

            return str;
        }

        @PostMapping
       /** public Map<String, String> create(@RequestBody Map<String, String> message) {
            message.put("id", String.valueOf(counter++));

            messages.add(message);

            return message;
        }**/
        public String create(@RequestBody String message) {
            str+=message;
            return str;
        }
    }