import java.util.*;
public class FactorialNonRecursive
{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter integer number: ");
  int number = input.nextInt();
  System.out.println("Factorial of " + number+ " is "+ Factorial(number));
 }
  
  public static int Factorial(int n){
  int result=1;
  for(int i =n ; i>0; i--){
    result *= i;
    }
    return result;
 }
 } 