public class Rectangule extends Figure {
    Point upperLeft;
    Point bottomRight;

    public Rectangule(String color, Point upperLeft, Point bottomRight) {
        super(color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double area() {
        int lado1, lado2;
        double area;
        // hipotenusa = (Math.pow((upperLeft.getpX()-bottomRight.getpX()),2) + Math.pow((upperLeft.getpY()-bottomRight.getpY()),2));
        lado1 = Math.abs (upperLeft.getpX()- bottomRight.getpX());
        lado2 = Math.abs (upperLeft.getpY()- bottomRight.getpY());

        return area=lado1*lado2;

    }

    @Override
    public double perimeter() {
        int lado1, lado2;
        double area;
        lado1 = Math.abs (upperLeft.getpX()- bottomRight.getpX());
        lado2 = Math.abs (upperLeft.getpY()- bottomRight.getpY());
        return 2 * (lado1 + lado2);
    }
}
