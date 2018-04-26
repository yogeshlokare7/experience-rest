package com.experience.controller;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.experience.model.Greeting;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "", method = RequestMethod.GET, produces = { MediaType.TEXT_PLAIN_VALUE })
	public @ResponseBody String test() {
		String msg = "Success\nDate: " + new Date().toString();
		return msg;
	}
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
}
