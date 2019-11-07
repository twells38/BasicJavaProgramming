
import java.util.Scanner;
public class IncomeTax
{  
    public static void main(String args[])
    { 
      // variable declaration
      int annualIncome;
      int taxRate;
      Scanner input = new Scanner(System.in); // create new scanner object
      System.out.print("Enter your income:"+"$"); // Prompt the user to enter income

      annualIncome = input.nextInt();
     
      
      if(annualIncome <= 50000){
        taxRate = 5;
      } 
      else 
         if(annualIncome >50000 && annualIncome <= 100000){
        taxRate = 15;
      }
      else 
         if(annualIncome >100000 && annualIncome <= 150000){
        taxRate = 20;
      }
      else 
         if(annualIncome >150000 && annualIncome <= 250000){
        taxRate = 30;
      }
      else 
         if(annualIncome >250000 && annualIncome <= 500000){
        taxRate = 35;
      }
      else {
         taxRate =50;
      }  
            
      System.out.println("Your Income:\t\t" +"$"+ annualIncome); // display result
      System.out.println("Tax bracket:\t\t" + taxRate + "%");
      
    }

}      
      
         