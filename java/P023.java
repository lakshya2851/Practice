

public class P023 {
    public static void main(String[] args) {

        for(int n=1;n<=100;n++)
        {
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
            System.out.println(n);
        }
    }
    }
    
}
