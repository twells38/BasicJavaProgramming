/*Write a program that inputs then name, quality and price of three items.The name may contain spaces .
  Output a bill with a tax rate of 5%. All prices should be ouput to two decimal places.
  The bill should be formatted in columns with 30 characteers fir the name, 10 characters for the quantity.
  10 characters for the price, and 10 characters for the total. Sample input and output its shown as follows:*/
  import java.text.DecimalFormat;
  import java.util.Scanner;

  public class CalculateTotal
  {  
     public static void main(String[]args){
     //declare variables
     String item1, item2, item3;
     int quantity1, quantity2, quantity3;
     double price1, price2, price3;
     Scanner input = new Scanner(System.in);
     //item 1
     System.out.print("Enter name of item 1: ");
      item1 = input.nextLine();
     System.out.print("Enter quatity: ");
      quantity1 = input.nextInt();
     System.out.print("Enter price of item 1: ");
      price1 = input.nextDouble();
      input.nextLine(); //needed because we are reading the whole line after reading numbers
     System.out.println();
     //item 2 
     System.out.print("Enter name of item 2: ");
      item2 = input.nextLine();
     System.out.print("Enter quatity: ");
      quantity2 = input.nextInt();
     System.out.print("Enter price of item 2: ");
      price2 = input.nextDouble();
      input.nextLine();
      System.out.println();

      // item3
     System.out.print("Enter name of item 3: ");
      item3 = input.nextLine();
     System.out.print("Enter quatity: ");
      quantity3 = input.nextInt();
     System.out.print("Enter price of item 3: ");
      price3 = input.nextDouble();
      input.nextLine();
      System.out.println();

      
      //calculate
      double total1, total2, total3;
      total1 = price1 * quantity1;
      total2 = price2 * quantity2;
      total3 = price3 * quantity3;
      
      double subtotal = total1 + total2 + total3;
      double tax = subtotal * 0.05;
      double total = subtotal + tax;
      
      System.out.println("Your bill: ");
      System.out.println("Item\t\t Quantity\t Price\t Total\t ");
      System.out.println("-------------------------------------");

      System.out.println(item1 + "\t\t\t\t" + quantity1 + "\t\t\t\t" + price1 + "\t\t" + total1);
      System.out.println(item2 + "\t\t\t\t" + quantity2 + "\t\t\t\t" +  price2 + "\t\t" + total2);
      System.out.println(item3 + "\t\t\t\t" + quantity3 + "\t\t\t\t" +  price3 + "\t\t" + total3);
      System.out.println("-------------------------------------"); 
      DecimalFormat df = new DecimalFormat("####0.00");
      System.out.println("Subtotal\t\t\t\t\t\t\t\t\t" + df.format(subtotal));
      System.out.println("5% sales tax\t\t\t\t\t\t\t" + df.format(tax));
      System.out.println("--------------------------------------");
      System.out.println("Total\t\t\t\t\t\t\t\t\t\t" + df.format(total));
      System.out.println("--------------------------------------");



      


      
  }
 }