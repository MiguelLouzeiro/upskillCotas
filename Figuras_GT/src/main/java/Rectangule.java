public class Rectangule extends Figure {
    Point upperLeft;
    float bottomRight;

    public Rectangule(String color, Point upperLeft, float bottomRight) {
        super(color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }
}
