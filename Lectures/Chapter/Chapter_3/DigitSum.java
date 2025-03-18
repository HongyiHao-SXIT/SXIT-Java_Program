package Lectures.Chapter.Chapter_3;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            num = Math.abs(num);
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            System.out.println("该数的各位数字之和是: " + digitSum);
        } else {
            System.out.println("输入无效，请输入一个有效的整数。");
        }
        scanner.close();
    }
}    