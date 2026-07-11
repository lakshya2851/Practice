import java.util.*;
public class P028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int add=0;
        while(n>0)
        {
            int ld =n%10;
            add=add*10+ld;
            n = n/10;
        }
        System.out.println(add);

    }
}
