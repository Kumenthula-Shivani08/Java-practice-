// import java.util.*;
// public class FibonaciNth{
//   public static void main(String [] args){
//  Scanner sc =new Scanner(System.in);
//     System.out.print("Enter no.of terms: ");
//     int n = sc.nextInt();
//    System.out.print("Fibanacci Series up to "+n+" terms ");
//    fibanacciSeries(n);
//   }
//   public static void fibanacciSeries(int n){
//     int a =0,b=1;
//     for(int i=0;i<n;i++){
//     System.out.print(a+" ");
//     int nextTerm = a+b;
//        a=b;
//        b=nextTerm;
//     }
//   }
// }

  
import java.util.Scanner;

public class FibonaciNth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the term (n): ");
        int n = scanner.nextInt();

        System.out.println("The " + n + "th term of the Fibonacci series is: " + FibonaciNth(n));
    }

    // Iterative function to find the nth Fibonacci number
    public static int FibonaciNth(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }
}
