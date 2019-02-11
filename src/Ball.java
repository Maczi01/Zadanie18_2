public class Ball extends Shape3D{

    private int radius;

    public Ball(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}