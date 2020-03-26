public class TestPayment
{ 
     public static void main(String[]args){
     
     Payment p = new Payment(3421);
     p.paymentDetails();
     System.out.println();
     //cash payment
     CashPayment cp = new CashPayment(2347);
     //cp.setAmount(2345);
     cp.paymentDetails();
     System.out.println();

     //credit card payment
     CreditCardPayment credit = new CreditCardPayment("sornya","14356789","12/14/2021",4568);
     credit.paymentDetails();
     }
}