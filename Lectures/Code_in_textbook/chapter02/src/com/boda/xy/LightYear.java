package com.boda.xy;

import java.util.Scanner;

public class LightYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	
    	int speed = 300000;      // 光速为每秒300000公里
        long seconds = 365 * 24 * 60 * 60; // 假设一年为365天
        long distance = speed * seconds;
        System.out.println("一光年的距离是 "+distance+" 公里。" );
        
    }
}
