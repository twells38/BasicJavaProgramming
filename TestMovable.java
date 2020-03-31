public class TestMovable
{
   public static void main(String[]args)
   {
       Movable m = new MovablePoint(5,6,10,5);
       m.moveUp();
       System.out.println(m);
       
       Movable circle = new MovableCircle(5,5,10,10,25);
       circle.moveDown();
       System.out.println(circle);
       
       
       Movable rectangle = new MovableRectangle(5,5,3,3,10,10);
       rectangle.moveDown();
       System.out.println(rectangle);
       
       Movable square = new MovableSquare(5,5,10,10,4);
       //square.moveDown();
       System.out.println(square);

       
   }
}