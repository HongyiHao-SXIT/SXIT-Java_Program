package Lectures.Chapter.Chapter_5;

public class AddArray {
    public static int[] sumArray(int[] a, int[] b) {
            if (a == null || b == null) {
                throw new IllegalArgumentException("Input arrays cannot be null");
            }
            
            if (a.length != b.length) {
                throw new IllegalArgumentException("Arrays must be of the same length");
            }
            
            int[] result = new int[a.length];
            
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + b[i];
            }
            
            return result;
        }
    }
