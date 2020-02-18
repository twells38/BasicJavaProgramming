/*Write a static method printTriangleNumber() take input from user */

import java.util.Scanner;
public class TriangleNumbers
{
     public static void main(String[]args)
    {
      int num;
      System.out.print("Please enter number: ");
      Scanner input = new Scanner(System.in);
              num = input.nextInt();
      printTriangleNumbers(num);
     }
     
     public static void printTriangleNumbers(int number)
     {
        int limit = number;
        
        for(int i=1; i <= limit;i++){
          for(int j =1; j<=number;j++){
          System.out.print(j+" ");
                    
         }
         System.out.println();
         number--;

         }
     }
         
}