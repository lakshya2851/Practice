import java.util.*;
public class P033 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int add=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                add=add+i;
            }
        }
        if(n==add)
        {
            System.out.println("Perfect NUmber");
        }
        else 
        {
             System.out.println("NOt Perfect NUmber");
        }
    }
}
