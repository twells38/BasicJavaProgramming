// Class:         CS 5000/W1
// Term:          Spring 2018
// Name:          Thassanee Wells
// Instructor     Dr. Haddad
// Assignment:    classes and objects

public class TestSummerStats
{
  public static void main(String[]args){
   

      SummerStats salary = new SummerStats(3,4);
      salary.allEarnings();
      System.out.println("Employee"+salary.mostMoney()+" made most money over the years");
      System.out.println("Highest salary was made in year"+ salary.highestSalaryYear());
      System.out.println("Total earning by Employee2 is "+"$"+salary.totalEarnings(1));
      System.out.println("In year 3,Employee"+(1+salary.highestSalaryPerson(2))
                          +" has the highest salary");
      salary.averageSalaryEachYear();
      
    } 
    
 }