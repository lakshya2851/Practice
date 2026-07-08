
import java.util.Scanner;

public class P024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int rev = 0;
        for (int i = n; i != 0; i = i / 10) {
            int digit = i % 10;
            rev = rev * 10 + digit;
        }
         if (org == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
    
}
