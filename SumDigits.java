// Class:         CS 5000/W1
// Term:          Spring 2018
// Name:          Thassanee Wells
// Instructor     Dr. Haddad
// Assignment:    recursion

import java.util.Scanner;
public class SumDigits
{
   public static void main(String[]args)
   {
       System.out.print("Entered  Integer: ");
       int number;
       Scanner input = new Scanner(System.in);
       number = input.nextInt();
       System.out.println("Digits Sum:\t\t\t"+Sum(number));
       
   }
   public static int Sum(int number){
      int total =0;
      if(number ==0){
      return 0;
      }
      else
      return number%10 + Sum(number-1);// number%10 = remainder  
                   // number/10 remove the last digit from user specified number
      
      }
   }
   
     /* use while loop
     while(number>0){
      remainder = number%10;
      total = total + remainder;
      number = number/10;
      }*/
      