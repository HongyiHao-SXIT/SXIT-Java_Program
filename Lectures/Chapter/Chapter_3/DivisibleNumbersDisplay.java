package Lectures.Chapter.Chapter_3;
public class DivisibleNumbersDisplay {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 100; num <= 1000; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " ");
                count++;

                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}    