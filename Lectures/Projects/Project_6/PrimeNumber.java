package Project_6;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        boolean isPrime;
        System.out.println("The first 50 prime numbers are as follows: \n");
        while (count < 50) {
            isPrime = true;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%5d%n", number);
                } else {
                    System.out.printf("%5d", number);
                }
            }
            number++;
        }
    }
}    