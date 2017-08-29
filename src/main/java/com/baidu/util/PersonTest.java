package com.baidu.util;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetPwd() {
		Person person = new Person();
		person.setName("nihao");
		person.setPwd("jjjj");
		
		ArrayList<Person> list = new ArrayList<Person>();
		for(int i=0;i<1000;i++)//一千条数据
		{
			list.add(person);
		}
		System.out.println(list);
	}

	@Test
	public void testSetPwd() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

}
