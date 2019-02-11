public class ShapeCalculator implements Calc2D, Calc3D{


    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape instanceof Circle)
            return Math.PI * Math.pow(((Circle) shape).getRadius(), 2);;
        if(shape instanceof Rectangle)
            return ((Rectangle) shape).getLength()*((Rectangle) shape).getHeight();
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape instanceof Ball)
            return 4.19 * Math.pow(((Ball) shape).getRadius(), 3);;
        if(shape instanceof Cube)
            return ((Cube) shape).getLength()*((Cube) shape).getHeight()*((Cube) shape).getWidth();
        return 0;
    }
}