import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        vX = 1;
        vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vY = vY;
        this.vX = vX;
    }

    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);

    }

    public void print() {
        String str = String.format(Locale.US, "%.2f", vX);
        String str1 = String.format(Locale.US, "%.2f", vY);
        System.out.println("("+str + ","+" " + str1+")");
    }



    public static void main(String[] args) {
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();
    }
}
