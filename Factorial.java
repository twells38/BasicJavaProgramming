import java.util.*;
public class Factorial

{ 
   public static void main(String[]args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter integer number: ");
     int number = input.nextInt();
     System.out.println("Factoria of "+ number+ " is " +Factorial(number));
    
    
    //long fac_5 = Factorial(5);//return factorial for specified number
    // System.out.println(fac_5);
    //Factorial fac = new Factorial();
    // System.out.println("Factorial of fac_5 is "+ fac_5);
    
    }
    
    public static long Factorial(int n){
    if(n==0){ // base case
    return 1;

    }
    else {
    return n*Factorial(n-1); // recursive call

    }
    
   } 

 }  