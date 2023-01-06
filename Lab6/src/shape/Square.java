package shape;

public class Square extends Rectangle {
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super();
    }

    @Override
    public String toString() {
        return "Shape.Square[" + super.toString() + ",width=" + Rectangle.getWidth() + ",length=" + getLength();
    }
}
