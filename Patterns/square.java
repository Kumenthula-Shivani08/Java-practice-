// import java.util.*;
// public class Square
// {
//   public  static void main(String args[]){
//     int n=5;
//     for(int i=1;i<4;i++)
//     {
//       for(int j=1;j<5;j++){
//         System.out.println("*");
//       }
//         System.out.println( );
//     }
//   }
// }
package patterns;

public class Square {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("*"); // Use print instead of println for correct formatting
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
