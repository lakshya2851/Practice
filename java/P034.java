public class P034 {
    public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue; // Skips the rest of this cycle
    }
    System.out.println(i);
// Output:
// 1
// 2
// 4
// 5
    }
    for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        break; // Destroys the loop completely
    }
    System.out.println(i);
}
// Output:
// 1
// 2



    }
    
}
