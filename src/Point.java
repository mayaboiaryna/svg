public class Point {
    public double x;
    public double y;

    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
    public String toSvg(){
        return "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"5\" fill=\"black\" />";
    }
    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }
    public Point translated(double dx, double dy){
        Point p = new Point();
        p.x = this.x + dx;
        p.y = this.y + dy;
        return p;
    }
}
