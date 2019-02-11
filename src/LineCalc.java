public class LineCalc extends ShapeCalculator{

    double lineLength(Line2D line){
        double l = Math.sqrt(Math.pow((line.getStartPointX() - line.getStartPointY()), 2.0) +
                Math.pow(line.getEndPointX() - line.getEndPointY(), 2.0));
        return l;
    }

}