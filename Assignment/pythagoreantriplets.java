import java.util.Scanner;
public class pythagoreantriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit  = sc.nextInt();

        for (int a = 1; a < limit; a++) {
            for (int b = a; b < limit; b++) {
                for(int c=b;c<limit;c++){
                    if(a*a + b*b == c*c){
                        System.out.println("Found Pythagorean triplet: " + a + ", " + b + ", " + c);
                    }
                }
        
            }
        }
    }
}