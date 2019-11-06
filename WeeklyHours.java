// Class:         CS 5000/W1
// Term:          Spring 2018
// Name:          Thassanee Wells
// Instructor     Dr. Haddad
// Assignment:    7 Multi-Dimension Arrays


import java.util.Scanner;
public class WeeklyHours
 {    
      public static void main(String[]args)
    { 
    
          // initialized array with random value
         Scanner input = new Scanner(System.in);
         char repeat = 'y';
         while (repeat == 'y' || repeat == 'Y') {  // rerun program
        
         int[][]m = new int[3][7];
         for(int i =0; i<m.length; i++){   // row
           for( int j =0; j<m[i].length;j++){  //column
              m[i][j] =(int)(Math.random()*11);  
                      
            } 
            
         }
        
         // print Arrays
         System.out.print("   ");
         System.out.println("    "+"\t\t Mon\t Tues\t Wed\t Fri\t Thu\t Sat\t Sun ");
         System.out.println("\t\t\t\t-------------------------------------------- ");
         for(int i =0;i<m.length;i++){
            System.out.print("Employee#" + (i+1));
            for(int j =0; j<m[i].length;j++){
            System.out.print("\t "+ m[i][j]+ " ");
            }
           System.out.println(); // go to next row
          } 
          System.out.println();//new line
          System.out.println("   "+"Employee#"+"\t\t\tWeekly Hours");
          System.out.println("....................................");

   
          // call addHours method
         addHours(m);

         System.out.print("Enter Y to repeat or N to quit: ");
         repeat = input.next().charAt(0);
       }  
         while (repeat != 'y' && repeat != 'Y' && repeat != 'n' && repeat != 'N') {

                System.out.println("That is an invalid input. Please enter either Y to repeat or N to quit.");

                repeat = input.next().charAt(0);

       }
  }       
         
          public static int[] addHours(int [][]matrix)
     {      
           int empTotalWorkHour[]= new int[7];

           for(int i=0; i< matrix.length; i++){
            int hourSum=0;
            for(int j=0;j<matrix[i].length;j++){
                hourSum+= matrix[i][j];
                }
                
             empTotalWorkHour[i]=hourSum;
             System.out.println("    "+(i+1)+"\t\t\t"+"     "+"\t\t\t"+empTotalWorkHour[i]);
      
            }
        return empTotalWorkHour;
      }  
 }
