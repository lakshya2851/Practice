import java.util.Scanner;
public class P025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        // Calculate sum of digits raised to power 'digits'
        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * rem;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }

        sc.close();
}
}