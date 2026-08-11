import java.util.Scanner;

public class PrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
                sum = sum + digit;
            }

            n = n / 10;
        }

        System.out.println();
        System.out.println("Sum of Prime Digits = " + sum);

        
    }
}