import java.util.Scanner;
public class countOccurrences
{ 
   public static void main(String[]args)
   {  
       
      
        System.out.print("Enter String: ");
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        System.out.print("Enter Character: ");
        char letter = input.next().charAt(0);// read char input
        
        int count=Count(words,letter);//invoke Count method
        
        System.out.println("Occurrences of letter "+letter+" in string is "+Count(words,letter)+" "+
                           ((count==0||count==1)?"time." :"times."));
   }     
        public static int Count(String w ,char l){ // Count method 
         int count = 0;
         if(w.length()>0){
           if(w.charAt(0)==l){
           count++;
          }
          return count + Count(w.substring(1),l);
        }
        return count;
     
         }
      }
      