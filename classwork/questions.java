// import java.util.Scanner;
// public class questions {
//     public static void main(String[] args) {
//         int a=123;
//         int rev=0;
//         while(a!=0){
//             int digit = a%10;
//             rev = rev*10+digit;
//             a=a/10;
//         }
//         System.out.println("reversed number:" + rev);
//     }

//check palindrome
// public static void main(String[] args) {
//     int a=329;
//     int num=a;
//     int rev=0;
//     while(a!=0){
//         int digit=a%10;
//         rev=rev*10+digit;
//         a=a/10;
//     }
//     if(num==rev){
//         System.out.println("plaindrome");
//     }
//     else{
//         System.out.println("not palindrome");
//     }

// }

//pattern
// public static void main(String[] args) {
    //  int height = 7; // Height of the vertical line
    //     int horizontalLength = 8; // Length of the horizontal line before the arrowhead

    //     // Print the vertical line and the horizontal line
    //     for (int i = 0; i < height; i++) {
    //         if (i == height / 2) { // This is the row where the horizontal line starts
    //             for (int j = 0; j < horizontalLength; j++) {
    //                 System.out.print("* ");
    //             }
    //         } else {
    //             System.out.print("*"); // Print only the vertical star
    //         }
    //         System.out.println(); // New line after each row
    //     }

        // Print the arrowhead part
        // Upper part of arrowhead
        // for (int i = 0; i < height / 2; i++) {
        //     for (int j = 0; j < horizontalLength + i; j++) {
        //         System.out.print("  "); // Print spaces to align
        //     }
        //     System.out.println("*");
        // }

        // // Lower part of arrowhead
        // for (int i = height / 2 - 1; i >= 0; i--) {
        //     for (int j = 0; j < horizontalLength + i; j++) {
        //         System.out.print("  "); // Print spaces to align
        //     }
        //     System.out.println("*");
        // }
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        // }


        //pattern
    //     int n=5;
    //     //upper half
    //     for(int i=0;i<n/2;++i){
    //         System.out.print("*"+" ");
    //         for(int j=0;j<n+2;++j){
    //             System.out.print(" "+" ");
    //         }
    //         for(int k=1;k<=i+1;++k){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    //    // middle line 
    //    for(int l=0;l<n+3;++l){
    //     System.out.print("*"+" ");
    //    }
    //    for(int l=0;l<n/2+1;++l){
    //     System.out.print("*"+" ");
    //    }
    //    System.out.println();

    //    //lower half
    //     for(int i=n/2;i>0;--i){
    //         System.out.print("*"+" ");
    //         for(int j=0;j<n+2;++j){
    //             System.out.print(" "+" ") ;
    //         }
    //         for(int k=1;k<i+1;++k){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
       
    // int a = 10000;
    // byte b = (byte)a;
    // System.out.println(b);
    // long a =599;
    // float b = a;
    // System.out.println(b);
    // double d = 99.99;
    // int x = (int)d;
    // System.out.println(x);

//     int[] arr = {2,3,5,0,1};
//     Scanner.sort(arr);
//     System.out.println(Scanner.toString(arr));
// }
    
// }
import java.util.Arrays;
public class questions {
    public static void main(String[] args) {
        int[]arr ={2,5,3,0,1};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,7);
        System.out.println(Arrays.toString(arr));
    }
}




