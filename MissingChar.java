/*Given a non empty string and an int n, return a new string 
  where that char at index n has been
  removed.The value of n will be a valid index of a char
  in the original string
  (i.e. n will be int the range 0..str.length()-1 inclusive
*/
import java.util.Scanner;
public class MissingChar
{
   public static void main(String[]args)
   {   
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter word: ");
       String word = input.nextLine();
       System.out.print("Please enter number of index that you want to remove: ");
       int number = input.nextInt();
       
       System.out.println(missingChar(word, number)); //called method
        
        
    }
    
    public static String missingChar(String str,int n)
    {
           String front = str.substring(0,n);
           String back = str.substring(n+1,str.length());
           return front+back;
           
     }
   } 