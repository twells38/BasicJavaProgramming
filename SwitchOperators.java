/*Write two numbers calculator, the program should ask for 2 numbers and 1 operator
 and make sure do not divide by zero*/

import java.util.Scanner;
public class SwitchOperators
{
    public static void main(String[]args)
    {   
        System.out.print("Please enter 2 numbers: ");
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double result =0;
        
        System.out.println("Please type an operator: ");
        System.out.println("1:addition");
        System.out.println("2:multiply");
        System.out.println("3:substraction");
        System.out.println("4:division");
        System.out.print("Please choose one operator: ");
        int operator = input.nextInt();


        switch(operator){
          case 1:
               result= number1+number2;
               break;
          case 2:
               result=number1*number2;
               break;
          case 3:
               result=number1-number2;
               break;
          case 4:
               if(number2 ==0){
               System.out.println("error");
               }else{
               result= number1/number2;
               }
               break;
            default:
             System.out.println("Wrong Choice");
           }
           System.out.println("The result is "+ result);
       }
    }
               