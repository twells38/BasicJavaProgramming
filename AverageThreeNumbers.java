/* Write the program that ask the user to enter 3 real numbers between 0-100,
then display the average of this numbers and then display "Sorry" if the average 
is less than 60 and"Congrats " Otherwise*/

import java.util.Scanner;
public class AverageThreeNumbers
{
   public static void main(String[]args)
   {
      int [] array = new int[3];
      double average;
      Scanner input = new Scanner(System.in);
            for(int i=0; i< array.length;i++){
          System.out.print("number"+(i+1)+": ");
          array[i]=input.nextInt();
          if(array[i]<0 || array[i]>100){
            System.out.println("Sorry, Please replace "+array[i]+" with another number:");
            i--;
           }

          }
      //print array
      System.out.print("Entered numbers: ");
      for(int i=0;i< array.length;i++){
          System.out.print(array[i]+" ");
      
         }
         
      System.out.println(" ");
      average(array);
      
 
 }
  public static void average(int[]array){
         double sum=0;
         int count=0;
         double average;
        for(int i = 0; i< array.length;i++){
           sum+=array[i];
           count++;
        
        }
        average = sum/count;
        if(average<60){
         System.out.println("Sorry average is less than 60");
         }
         else{
         System.out.println("Congrats!");
         }
  }



}