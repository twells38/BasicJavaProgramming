import java.util.Scanner;
public class ConvertFarenheit// convert celsius to farenheit
{
     public static void main(String[]args){
     double farenheit;
     double celsius;
     Scanner input = new Scanner(System.in);
     System.out.print("Please enter celsius degree: ");
     celsius = input.nextDouble();
     farenheit = 9.0/5.0* celsius +32 ;
     System.out.println("Farenheit degree: "+ farenheit);
     }
  }