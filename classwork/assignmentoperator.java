import java.util.Scanner;
public class assignmentoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x=a += b;
        int y = a -=b;
        int z = a *=b;
        int w = a /=b;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
    
}
