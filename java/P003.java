public class P003
{
    public static void main(String[] args) {
        int a=10 ;
        int b=20;
        System.out.println("Before swap value of A and B "+a +" "+ b); 
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Before swap value of A and B "+a +" "+ b);
    }
}