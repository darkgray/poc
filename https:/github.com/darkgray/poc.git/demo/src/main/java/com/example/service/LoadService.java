package com.example.service;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadService {
	
	@RequestMapping(path="/load/{loop}",method=RequestMethod.GET)
	public String loadTest(@PathVariable Long loop) {
		List<Double> list = new LinkedList<Double>();
		List dummy = new LinkedList();
		for (long l = 0; l < loop; l++) {
			list.add(Math.random());
			dummy.add(new ConcurrentHashMap());
		}
		return "Completed" + list.toString();
	}

}
