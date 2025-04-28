package com.boda.xy;
interface AA { 
   int STATUS = 100;                    // 常量声明
   public abstract void display();   // 一个抽象方法
}
interface BB { 
   public abstract void show();        // 一个抽象方法
   public default void print(){        
    System.out.println("这是BB接口的默认方法");
}
}
// 接口CC继承了接口AA和接口BB
public interface CC extends AA, BB{ 
   int NUM = 3;                        // 定义一个常量
}


