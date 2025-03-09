package Lectures.Chapter.Chapter_3;

public class number_devide {
    static int time = 1;

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                time++;
                if (time % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}