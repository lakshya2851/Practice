
import java.util.Scanner;

public class P022 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n= sc.nextInt();
        int a=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a++;
            }
        }
        if(a==0)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    
}
