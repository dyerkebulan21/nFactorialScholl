import edu.princeton.cs.algs4.StdDraw;

public class Art {

    public static void drawCircle(double x, double y, double d) {
        // draws gray outline around each circle
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.circle(x, y, d);


    }

    public static void draw(int n, double x, double y, double d) {
        if (n == 0) return;
        double halfRadius = d / 2;

        drawCircle(x, y, d);
        double x0 = x - d / 2;
        double x1 = x + d / 2;
        double y1 = y + d / 2;
        draw(n - 1, x0, y1, d / 2);
        //draw(n - 1, y1, x0, d / 2);
        draw(n - 1, x1, y1, d / 2);

    }

    public static void main(String[] args) {
        draw(4, 0.5, 0.5, 0.5);

    }


}
