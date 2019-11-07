public class ReverseArray2
{
  public static void main(String[]args)
  {
      int[] number = new int[5];//create an array to store numbers.
      System.out.print("Array of 5 integer numbers before reverse: ");
      java.util.Scanner input = new java.util.Scanner(System.in);
      for(int i= 0; i< number.length; i++){
          number[i]= input.nextInt();
         }//display array
        System.out.print("Entered 5 integer numbers: ");
        for(int i=0;i<number.length;i++){
        System.out.print( number[i]+ " ");
        }
       
       // display distinct value
       System.out.print("\nDistinctValue: ");
       for(int j = 0; j< 5;j++){
          boolean isEqual = false;
          for(int i=0; i< j;i++){
            if(number[j]==number[i]){
              isEqual = true;
              break;
              }
            }
          if(isEqual == false){
          System.out.print(number[j]+" ");
        }
      }
      reverse(number); 
    }
       
        public static void reverse(int[]x){    
        System.out.print("\nArray after reverse: ");
        for(int i = x.length-1;i>=0;i--){
        System.out.print(x[i]+" ");
      }
    } 
  }       
 
      