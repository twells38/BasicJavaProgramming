
import java.util.Scanner;
public class BestDeal
{
    public static void main(String args[])
    { 
       float smallweight,smallprice, largeweight,largeprice;
       float smallBox,largeBox;
      
       Scanner input = new Scanner(System.in); // create new scanner object

       System.out.print("Small box weight:  "); // prompt user to enter weight
       smallweight = input.nextInt();
       System.out.print("Small box price:\t "); // prompt user to enter price 
       smallprice = input.nextInt();
       System.out.print("Large box weight:  ");
       largeweight = input.nextInt();
       System.out.print("Large box price:\t ");
       largeprice = input.nextInt();
       // compute the price
       smallBox = smallprice/smallweight;
       largeBox = largeprice/largeweight;
       
       if( smallBox > largeBox){
       System.out.println("Judgment:\t"+"The large box is better deal");
       }
       else if (largeBox > smallBox){
       System.out.println("Judgment:\t"+"The small box is better deal");
       }
       else {
       System.out.println("Judgment:\t"+"The small box and the large box is same deal");
       }
     }
   }       
       
       


       
       
 
 
       
       