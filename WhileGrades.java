import java.util.Scanner;
public class WhileGrades
{
    public static void main(String[]args)
    {    
         int count=1; 
         double average;
         int sum=0;
         Scanner input = new Scanner(System.in);
                  
         while(count<=3){
         System.out.print("Please enter grade"+count+" 1 to 100: ");
         int grade = input.nextInt();
         if(grade<0 || grade>100){
         System.out.println("ERROR!");
         }else{
         sum += grade;
         count++;
         }
        }
         average = sum/3.0;
         System.out.println("The average of yout grades is "+average);
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
