import java.util.Scanner;
class Triangle2 extends Shape
{
   private double base;
   private double height;
   
   public Triangle2(){ //default constructor
   }
   
   public Triangle2(double base, double height, String color){ //class constructor
   super(color);
   this.base = base;
   this.height = height;
   }
   
   public double getBase(){
   return base;
   }
   public void setBase(double base){
   this.base = base;
   }
   public double getHeight(){
   return height;
   }
   
   public void setHeight(double height){
   this.height = height;
   }
   
   // getArea method 
   @Override
   public double getArea(){
   return  (height*base)/2;
   }
   
   @Override
   public String toString(){
   return "Triangle {"+ "base= "+base+ ". height= "+height+", color= "
           +super.getColor()+", area= " +getArea()+ "}";
   }
}