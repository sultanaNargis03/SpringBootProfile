package com.telusko.services;

import org.springframework.context.annotation.Profile;

//@Profile("mockito")
public class Mockito implements Courses{

	@Override
	public boolean registerToCourse(Double cost) {
		System.out.println("Mockito course registered amount paid "+cost);
		return true;
	}

}
