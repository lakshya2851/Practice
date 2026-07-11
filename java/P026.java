import java.util.Scanner;

public class P026 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            a=a+b;
            
           a = a ^ b;
           b = a ^ b;
           a = a ^ b;
    
        }
    }
}
