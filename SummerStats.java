// Class:         CS 5000/W1
// Term:          Spring 2018
// Name:          Thassanee Wells
// Instructor     Dr. Haddad
// Assignment:    classes and objects

public class SummerStats
{
   private int[][]salary; //instance variable
   
   SummerStats(int employees, int years){ //constructor method
   salary =new int[employees][years];
   for(int row = 0; row<salary.length;row++){
    for(int column=0; column< salary[row].length;column++){
        salary[row][column]=2000+(int)(Math.random()*48000);
       }
     }
    //display array
    System.out.println("Employee Data: ");
    System.out.print("  ");
    System.out.println("\t\t\t"+"\t\tYear1\t"+"\tYear2\t"+"\tYear3\t"+"\tYear4");
    System.out.println("...............................................");
    for(int row = 0; row<salary.length;row++){
       System.out.print("Employee"+(row+1));
     for(int column = 0; column<salary[row].length;column++){
        System.out.print("\t\t"+salary[row][column]);
      }
      System.out.println();
     }
   } 
      
      //method named MostMoney return the index of the person having made the most money
      public int mostMoney(){
      double maxSalary = 0; // local variable
      int indexOfMaxSalary =0;
      for(int row=0; row< salary.length;row++){
        double totalSalary =0;
       for(int column =0; column<salary[row].length; column++){
            totalSalary += salary[row][column];
            if (totalSalary > maxSalary){
               maxSalary = totalSalary;
               indexOfMaxSalary = row+1;
             }
          }
        }
        return indexOfMaxSalary;
     }
    // method named highestSalaryYear
     public int highestSalaryYear(){
      double maxSalary = 0;
      int indexOfYear =0;
      for(int column =0; column<salary[0].length;column++){
        double totalSalary =0;
        for(int row = 0; row< salary.length;row++){
           totalSalary += salary[row][column];
           if(totalSalary > maxSalary){
              maxSalary = totalSalary;
              indexOfYear = column+1; // current index of year as maximum index
           }
        }
      }
     return indexOfYear;
   }
       // method named totalEarning
       public double totalEarnings(int employee_index){
        double totalSalary = 0;
        for(int column =0; column<salary[employee_index].length;column++){
           totalSalary +=salary[employee_index][column]; //calculate total salary of this row
        }
       return totalSalary;
    }
    
     // method named highestSalaryPerson
      public int highestSalaryPerson(int year_index){
        int highest_salary =0;
        for(int row=0; row<salary.length; row++){
        if(salary[row][year_index]>salary[highest_salary][year_index]){
           highest_salary = row;
        }
      }
       return highest_salary;
     }
       
      // method named totalEaning
   public void allEarnings(){
     int sum =0;
     for(int row = 0;row<salary.length;row++){
       for(int column=0; column<salary[row].length;column++){
       sum += salary[row][column];
      }
     }
    System.out.println("\nTotal earning by employees is: "+"$"+ sum);
  }
  
     //method named averageEarningEachYear
     // create single array to store the average salary
     public void averageSalaryEachYear(){

      float[]average_salary = new float[salary[0].length];
      System.out.println("\nThe average Salary for year: ");
      System.out.println("\n "+ "\tYear1"+"\t\t\tYear2"+"\t\t\tYear3"+"\t\t\tYear4");
      System.out.println(" "+ ".............................................");
      for(int row=0; row<salary[0].length;row++){
      float sum =0;
        for(int column = 0; column<salary.length;column++){
         sum += salary[column][row];
        }
       System.out.print("\t"+sum/salary[0].length+"\t");
     }
     System.out.println(" ");
  }
  
 }      
      
     
   