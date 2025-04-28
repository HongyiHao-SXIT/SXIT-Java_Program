package Project_11;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {75, 53, 32, 12, 46, 199, 17, 54};
        System.out.print("Initial elements: ");
        for (var n : a) {
            System.out.print(" " + n);
        }
        System.out.println();
        for (var i = 0; i < a.length - 1; i++) {
            for (var j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("Result after pass " + (i + 1) + ":");
            for (var n : a) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
    }
}    