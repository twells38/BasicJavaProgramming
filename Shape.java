import java.util.Scanner;
class Shape
{
  private String color;
  
  public Shape(){ //default constructor
  color ="White";
  }
  public Shape( String color){ // class constructor
  this.color =color;
  }
  
  public String getColor(){
   return color;
   }
  public void setColor( String color){
   this.color = color;
   }
   
  // getArea method
  public double getArea(){
   return 0;
   }
  @Override
  public String toString(){
    return "Shape {"+ "color =" + color +",area= "+ getArea()+"}";
  }
  
}