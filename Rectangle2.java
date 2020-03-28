import java.util.Scanner;
class Rectangle2 extends Shape
{ 
   private double length;
   private double width;
   
   public Rectangle2(){
   
   }
   public Rectangle2(double length, double width, String color){
   super(color);
   this.length = length;
   this.width = width;
   }
   
   public double getLength(){
    return length;
    }
   public void setLength(double length){
   this.length = length;
   }
   public double getWidth(){
    return width;
    }
   public void setWidth( double width){
    this.width = width;
    }
   
   //getArea method
   @Override
   public double getArea(){
   return length*width;
   }
   
   @Override
   public String toString(){
   return "Rectangle {"+ "length= "+length+ ". width= "+ width+", color= "
           +super.getColor()+", area= " +getArea()+ "}";
   }
}
 
   
    
   
   
