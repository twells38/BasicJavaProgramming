/*Given an array  of integers. 
write a  java code that allows to check if the array is "palindromic"
a palindrom array is a sysmetric one.*/

import java.util.Scanner;
public class IsPalindromicArray
{
    public static void main(String[]args){
         int size;
         System.out.print("Please enter size of array: ");
         Scanner input = new Scanner(System.in);
                 size = input.nextInt();
         
         int[] array = new int[size];
         for(int i=0;i<array.length;i++){
            System.out.print("Enter number of"+"["+i+"]"+": ");
             array[i] = input.nextInt();
         }
         
         //is palindromic array
         boolean isPalindromic = true;
         for(int i=0; i<size/2;i++){
             if(array[i]!=array[size-1-i]){
               isPalindromic =false;
               break;
               }
              }
            if(isPalindromic){
            System.out.println("This array is palindrom");
            }else{
            System.out.println("This array is not palindrom");
            }
           
     }

}