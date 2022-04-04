public class Circle extends Figure {

    private Point center;
    private double radius;

    public Circle(String color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void expand(double scaleFactor){

    }

    @Override
    public double perimeter (){
        return 2 * Math.PI * this.radius   ;
    }

    @Override
    public double area() {
        return 0;
    }

}
