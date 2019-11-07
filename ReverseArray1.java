public class ReverseArray1 
{
   public static void main(String[]args)
   {
       int[]number = {1,2,3,4,5,6,7,8,9,10};
       System.out.print("Array before reverse: ");
       for(int i=0;i<number.length;i++){
       System.out.print(number[i]+" ");

       }
      reverse(number);// display reverse number from method
     }
     public static void reverse(int[]x){    
        System.out.print("\nArray after reverse: ");
        for(int i = x.length-1;i>=0;i--){
        System.out.print(x[i]+" ");
    }      
   }
 }      