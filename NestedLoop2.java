import java.util.Scanner;
public class NestedLoop2
{
      public static void main(String[]args)
      
      {    int sizeBox;
           Scanner input = new Scanner(System.in);
           do{
            System.out.print("Please enter size of box: ");
            sizeBox = input.nextInt();
           
           for(int i=1; i<=sizeBox; i++){
             for(int j=1; j<=sizeBox; j++){
               if(i==1 ||i==sizeBox ||j==1 ||j==sizeBox){
               System.out.print("#"+"");
             }else{
             System.out.print(" ");
            }
           }
           System.out.println();
          }        
         }while(sizeBox >0);
       }
  }