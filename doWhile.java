import java.util.Scanner;
public class doWhile
{
   public static void main(String[]args)
   { 
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter count number: ");
       int count = input.nextInt();

       do{
       System.out.print("Hello! ");
       count = count -1;
       }
       while(count>0);
   }
}