package com.baidu.util;



import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.BeanUtilsBean2;
import org.junit.Test;

public class PersonTest {


	@Test
	public void testGetPwd() {
		
		//java对象转化为json字符串
		/*Person p=new Person();
		p.setName("陈坤");
		p.setPwd("123");
		JSONObject fromObject = JSONObject.fromObject(p);
		String string = fromObject.toString();
		System.out.println(string);*/
		
		//字符串解析
		/*String aa="{'name':'陈坤','pwd':'123'}";
		JSONObject fromObject = JSONObject.fromObject(aa);
		System.out.println(fromObject.get("name"));*/
		
		/*//json字符串转化为java对象
		String aa="{'name':'陈坤','pwd':'123'}";
	   Person  p=(Person) JSONObject.toBean(JSONObject.fromObject(aa),Person.class);
	   System.out.println(p.getName());*/
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetPwd1() throws IllegalAccessException, InvocationTargetException 
	{
		/*Person person = new Person();
		person.setName("周笔畅");
		person.setPwd("123");
		//对象转成json字符串
		JSONObject fromObject = JSONObject.fromObject(person);
		String string = fromObject.toString();
		System.out.println(string);*/
		
		/*//字符串解析
		String aa="{'name':'周笔畅','pwd':'123'}";
		JSONObject fromObject = JSONObject.fromObject(aa);
		System.out.println(fromObject.get("name"));*/
		
		/*//字符串转换为java对象
		String aa="{'name':'周笔畅','pwd':'123'}";
		JSONObject fromObject = JSONObject.fromObject(aa);
		Person p=(Person) JSONObject.toBean(fromObject,Person.class);
		System.out.println(p);*/
		
	  /*JSONObject js=new JSONObject();
	   js.put("1", "你好");
	   js.put("2", "笔场");
	   System.out.println(js);*/
		
		
		/*JSONArray jsonArray = new JSONArray();
		jsonArray.add(0,"chenkun");
		jsonArray.add(1,"kkk");
		jsonArray.add(2,"ll");
		System.out.println(jsonArray);*/
		
		//集合转为json数组
		ArrayList<Person> list = new ArrayList<Person>();
		/*Person person = new Person();
		person.setName("陈坤");
		for(int i=0;i<10;i++)
		{
			list.add(person);
		}*/
		/*System.err.println(JSONArray.fromObject(list));*/
		
		
		//json字符串转list集合
		/*String aa="[{'name':'陈坤','pwd':'11'},{'name':'陈坤','pwd':'22'}]";
        JSONArray fromObject = JSONArray.fromObject(aa);
        List<Person> list2 = (List) JSONArray.toCollection(fromObject,Person.class); 
        List list2 = JSONArray.toList(fromObject, Person.class);
        System.out.println(list2);*/
		
		//beanUtil的使用
		Person person = new Person();
		person.setName("陈坤");
		person.setPwd("123");
		person.setDd("nihao");
		Student student = new Student();
		BeanUtils.copyProperties(student, person);
		System.out.println(student);
        
	}

	

}
