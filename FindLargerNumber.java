import java.util.Scanner;

public class FindLargerNumber
{
   public static void main(String[]args){
   int i;
   System.out.print("Enter number of elements in array: ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.print("Enter elements of array: ");
    int[]arr = new int[num];
        for(i=0; i< num;i++){
       arr[i] = input.nextInt();
      } 
     int max= arr[0];
     for(i=0; i<num; i++){
    if ( arr[i] > max){
      max = arr[i];}
      }
      System.out.println("Largest number in array is:" +max);
     
}
}