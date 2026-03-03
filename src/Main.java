public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        System.out.println("start p = " + p);

        p.translate(5, -2);
        System.out.println("after translate p = " + p);

        Point q = p.translated(100, 100);
        System.out.println("q = " + q);
        System.out.println("p = " + p);
        }
    }