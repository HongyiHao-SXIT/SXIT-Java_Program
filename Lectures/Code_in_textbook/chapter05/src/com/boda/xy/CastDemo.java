package com.boda.xy;
public class CastDemo{
    public static void main(String[] args){
       var emp = new Employee("张明月",30,5000);
       System.out.println(emp);
       Person p = emp;            // 自动类型转换
       System.out.println(p);
       p.sayHello();         
       System.out.println(p.getClass().getName());
       emp = (Employee)p;        // 强制类型转换      
       System.out.println(emp.computeSalary(5,50));
    }
}