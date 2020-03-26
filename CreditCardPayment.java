import java.util.Scanner;
class CreditCardPayment extends Payment
{
   private String name;
   private String cardNumber;
   private String expirationDate;
   
   public CreditCardPayment(){
   }
   public CreditCardPayment(String name, String cardNumber, String expirationDate, double amount){
   super(amount);
   this.name = name;
   this.cardNumber = cardNumber;
   this.expirationDate = expirationDate;
   }
   
   public String getName(){
   return name;
  }
   public void setName(String name){
   this.name =name;
  }
  
   public String getCardNumber(){
   return cardNumber;
   }
   public void setCardNumber(String cardNumber){
   this.cardNumber = cardNumber;
   }
   
   public String getExpirationDate(){
   return expirationDate;
   }
   
   public void setExpirationDate(){
   this.expirationDate = expirationDate;
   }
   
 @Override
   public void paymentDetails(){
   super.paymentDetails();
   System.out.println("Paid with the following credit card number: " + cardNumber);
   System.out.print("Name: "+name+ " EXP: "+ expirationDate);
   }
}
