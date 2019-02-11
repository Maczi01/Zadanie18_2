public class Line2D extends Shape2D {

    private int startPointX;
    private int startPointY;
    private int EndPointX;
    private int EndPointY;

    public Line2D(String name, int startPointX, int startPointY,  int EndPointX,  int EndPointY) {
        super(name);
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.EndPointX  =  EndPointX;
        this.EndPointY  =  EndPointY;
    }
    //wygenerowac getry swetry


    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    public int getEndPointX() {
        return EndPointX;
    }

    public void setEndPointX(int endPointX) {
        EndPointX = endPointX;
    }

    public int getEndPointY() {
        return EndPointY;
    }

    public void setEndPointY(int endPointY) {
        EndPointY = endPointY;
    }
}