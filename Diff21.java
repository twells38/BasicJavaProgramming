/* Given an int n, return the absolute difference between n and 21, 
except return double the absolute different if n is over 21*/
//checked

import java.util.Scanner;
public class Diff21
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a integer number: ");
        int number = input.nextInt();
        System.out.println(differ21(number));
         
     }
     public static int differ21(int n)
     {   
         if(n<=21){
         return 21-n;
         }else{
         return n-21;
         }
     }
  }
         
         
