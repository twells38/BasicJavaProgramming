/*Write a program that read 3 grades between 0 snd 100. 
validate the input that ensure that the user enter valid grades.
calculate the average and display the letter grade of average.
-do while loop condition is evaluate after the execution of statement-*/
import java.util.Scanner;
public class DoWhileGrades
{
    public static void main(String[]args)
    {    
         int grade1, grade2, grade3;
         double average;
         Scanner input = new Scanner(System.in);
         do{
         System.out.print("Please enter first grade between 0 and 100: ");
          grade1 = input.nextInt();
         }
         while(grade1<0 || grade1>100);
         do{
         System.out.print("Please enter second grade between 0 and 100: ");
          grade2 = input.nextInt();
         }
         while(grade1<0 || grade1>100);
         do{
         System.out.print("Please enter Third grade between 0 and 100: ");
          grade3 = input.nextInt();
         }
         while(grade1<0 || grade1>100);
         
         average = (grade1+grade2+grade3)/3;
         System.out.println("The average is " + average );
         

         if(average >=90){
           System.out.println("YOU GOT A");
          }else 
          if(average>=80){
          System.out.println("YOU GOT B");
          }else 
          if(average >= 70){
          System.out.println("YOU GOT C");
          } 
          else 
          if(average >=60){
          System.out.println("YOU GOT D");
          }
          else{
          System.out.println("YOU GOT F");
          }        
         }
      }
         
      
