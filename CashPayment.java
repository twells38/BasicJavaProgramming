import java.util.Scanner;
class CashPayment extends Payment
{ 
   public CashPayment(double amount){
     super(amount);
    }
   public CashPayment(){
   
   }
   
   
  @Override
  public void paymentDetails(){
        super.paymentDetails();
    System.out.println("This is a cash payment.");
  } 
} 
   
  
