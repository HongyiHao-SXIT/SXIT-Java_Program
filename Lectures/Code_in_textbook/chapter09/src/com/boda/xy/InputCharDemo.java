package com.boda.xy;
public class InputCharDemo{
    public static void main(String[] args){
       System.out.print("请输入一个字符：");
       var c = (char)System.in.read();    
       System.out.println("c = " + c);
    }
}

