public class Point {
    public double x;
    public double y;

    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
    public String toSvg(){
        return "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"5\" fill=\"black\" />";
    }
}
