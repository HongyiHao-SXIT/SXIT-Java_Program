package com.boda.xy;
import java.util.Scanner;
public class Exercise01{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n,sum = 0;
		n = input.nextInt();
		while(n > 0){
		   sum = sum + n%10;
		   n = n / 10;
		}
		System.out.println("各位数字之和为：" + sum);
	}
}


