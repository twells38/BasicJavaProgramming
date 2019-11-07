public class SingleArrayPractice1
{
    public static void main(String[]args)
  {
   
     int[] number = getArray(); // call method getArray
     
     System.out.println("Min number is " + getMin(number));// call method getMin
     System.out.println("Max number is "+ getMax(number));// call method getMax
 }
     public static int getMin(int[]x)
    { 
       int min = x[0];
       for(int i=1; i<x.length-1; i++){
        if(x[i]< min){
          min = x[i];
          }
        }
      return min;
   }
     public static int getMax(int[]number)
     {
         int max = number[0];
         for(int i = 1; i< number.length-1;i++){
           if(number[i]>max){
             max = number[i];
           }
          }
       return max;
       
 } 
     public static int[] getArray()
     {     
          int[] num = new int[5]; //create array to store numbers
          System.out.print("Enter 5 integer numbers: ");
          java.util.Scanner input = new java.util.Scanner(System.in);
          for(int i=0; i< num.length;i++){
           num[i]= input.nextInt();
        }
        return num;
   } 
}     