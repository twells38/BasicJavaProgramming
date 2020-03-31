public class MovableSquare extends MovableRectangle
{
    public MovableSquare(int x, int y, int xSpeed, int ySpeed,int side){
       super(x, y, x+side, y+side, xSpeed, ySpeed);
      }
    @Override
    public String toString(){
    return "MovableSquare {"+"topLeft= "+topLeft+" bottomRight= "+ bottomRight+"}";
    }
 }
