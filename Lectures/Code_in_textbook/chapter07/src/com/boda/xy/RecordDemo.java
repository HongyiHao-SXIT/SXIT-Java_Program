package com.boda.xy;
// 一个记录类型Person的定义
record Person(String name,int age,String address) {}
public class RecordDemo {
	public static void main(String[] args) {
		var person = new Person("张明月",20,"北京市海淀区");
		var person2 = new Person("张明月",20,"北京市海淀区");
		System.out.println("姓名：" + person.name());
		System.out.println("年龄：" + person.age());
		System.out.println("地址：" + person.address());		
		System.out.println(person.toString());
		System.out.println(person.equals(person2));
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());
	}
}

