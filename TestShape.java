import java.util.Scanner;
public class TestShape
{
   public static void main(String[]args){
     //polymorphism
     Shape[] list = new Shape[3];
     list[0] = new Triangle2(6,3,"Red");
     list[1] = new Triangle2(5,2,"Black");
     list[2] = new Rectangle2(5,3,"Pink");
     //display by loop throu each object
     for(int i=0; i<list.length;i++){
     System.out.println(list[i].toString());
     }
     
     //find max area
     double max = list[0].getArea();
     for(int i=0;i<list.length;i++){
        if( max < list[i].getArea()){
         max = list[i].getArea();
         }
        }
     System.out.println("Max area is: "+ max); 
     
   }
}