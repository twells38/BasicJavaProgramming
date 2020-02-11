/*Write an application that inputs 10 numbers, each between 0 and 100
,then display the list of numbers without  repetitions(duplicatate
 values are not printed more than once).
 For example: if the users enters 5 2 1 6 2 5 1 4 2 1,
 The program should display:5 2 1 6 4
 */
 import java.util.Scanner;

 public class RemoveDuplicatesArray
 {
   public static void main(String[]arg)
   {
         Scanner input  = new Scanner(System.in);
          int[] numbers = new int[3];// create new array
          System.out.println("Please enter "+numbers.length+ " numbers between 0 and 100: ");
         for(int i=0;i<numbers.length;i++){
             System.out.print("number "+ (i+1)+": ");
            numbers[i]= input.nextInt();
           //after reading numbers to make sure that numbers are valid
            //if not valid then ask to input another number
            if(numbers[i]<0 || numbers[i]>100){
             System.out.println("Error!"+numbers[i]+ " is not valid");
             System.out.println("Please replace "+ numbers[i]+ " with a number between 0 and 100");
             i--;
           }
        } 
        System.out.print("The entered numbers: ");
        for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        
        System.out.print("Display numbers without repetition are: "+ numbers[0]+" ");           
        
        for(int i =1; i<numbers.length;i++){
           boolean alreadyDisplayed = false; 
           for(int j =0; j<i;j++){
             if(numbers[i]==numbers[j]){
             alreadyDisplayed = true;
             break;
             }
            }
         if(alreadyDisplayed == false){
         System.out.print(numbers[i]+" ");
         }
       }
       System.out.println();
     }
             
  }  