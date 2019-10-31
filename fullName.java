import java.util.Scanner;

public class fullName
{
  public static void main(String[]args)
  {
   String fullName,firstName, lastName;
    System.out.print("Please enter your name: ");
    Scanner input = new Scanner(System.in);
    fullName = input.nextLine();
    //find first space postition
    //use indexOf() to find out the occurrence of specified char or a substring
    int firstSpacePosition = fullName.indexOf(" ");
    firstName = fullName.substring(0,firstSpacePosition);
    //find second space position
    //use lastIndexOf() to find out the index of last occurrence of char or substring
    int secondSpacePosition = fullName.lastIndexOf(" ");
    lastName = fullName.substring(secondSpacePosition+1);
    System.out.println("Hello "+ lastName.toUpperCase()+", "+ firstName.toUpperCase());
    
    }
 }
    