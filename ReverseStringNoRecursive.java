import java.util.Scanner;

public class ReverseStringNoRecursive

{
  public static void main(String[]args){
    System.out.print("Input: ");
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    
    System.out.println("Output: "+ myReverse(word));
  }
  public static String myReverse(String words){
    String reverse ="";
    int length = words.length();
    for(int i =length-1;i>=0; i--){
      reverse = reverse + words.charAt(i);
      }
      return reverse;
   }
 }