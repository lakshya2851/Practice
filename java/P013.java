import java.util.Scanner;
public class P013 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l =sc.nextInt();
        int b =sc.nextInt();
        int r =sc.nextInt();

        System.out.println("AREA OF RECTANGLE = "+l*b);
        System.out.println("PERIMETER OF RECTANGLE = " + 2*(l+b));
        System.out.println("AREA OF CIRCLE = "+3.14*r*r);
        System.out.println("PERIMETER OF CIRCLE = "+2*3.14*r);


    }
    
}
