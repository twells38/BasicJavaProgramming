/* Define a class named Payment that contains an instance variable of type
   double that stores the amount of the payment and appropriate accessor
   and mutator methods. Also create a method named paymentDetails
   that outputs and English sentence to describe the amount of the payment.
   
   Next, define a class named CashPayment that is derived from Payment.
   This class should redefine the paymentDetails method to indicate that the 
   payment is in cash. Include appropriate constructor(s).
   
   Define a class named CreditCardPayment that is derived Payment.
   This class should contain instance variables for the name on the card
   ,expiration date, and credite card number. Include appropriate constuctor(s).
   
   Finally, redifine the paymentDetails method to include all credit card information
   in the printout.
   
   Create a main method that creates at least two CashPayment 
   and two CreditCardPayment objects with different values and calls
   paymentDetails for each.
 */
 import java.util.Scanner;

 class Payment
 { 
     private double amount;
     private String[] digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
     private String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eight","ninety"};
     
     public Payment(){ //constructor
        amount = 0;
     }
     
     public Payment(double amount){
         this.amount = amount;
     }
     
     public double getAmount(){
         return amount;
     }
     public void setAmount(double amount){
         this.amount = amount;
     }
     
     
     //method paymentDetials
     public void paymentDetails(){
     System.out.print("The amount of payment is: ");
     String result;
     //amount 3425
     //get digit
     int number = (int)amount%10;
     result = digits[number];
     
     //get the tens
     amount = (int)amount/10; //342
     number = (int)amount%10;//2
     result = tens[number]+ " " + result;
     
     //get hundred
     amount = (int)amount/10; //34
     number = (int)amount%10; //4
     result = digits[number]+ "hundred and "+ result;
     
     //get thousands
     amount = (int)amount/10; //3
     number = (int)amount%10; //3
     result = digits[number]+"thousand "+result;
     
     System.out.println(result + ".");
    
     }
  }
 