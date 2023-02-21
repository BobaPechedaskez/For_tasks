import java.util.Locale;

public class Vector2D {
    public double X;
    public double Y;
    public Vector2D(){
        X=1;
        Y=1;
    }
    public Vector2D(double X, double Y) {
        this.Y = Y;
        this.X = X;
    }
    public Vector2D(Vector2D v) {
        this(v.X, v.Y);
    }
    public void print() {
        String str = String.format(Locale.US, "%.2f", X);
        String str1 = String.format(Locale.US, "%.2f", Y);
        System.out.println("("+str + ","+" " + str1+")");
    }
    public double length(){
        return Math.abs(Math.sqrt(X*X+Y*Y));
    }
    public void add(Vector2D v){
       X+=v.X;
       Y+=v.Y;
    }
    public void sub(Vector2D v){
        X-=v.X;
        Y-=v.Y;
    }
    public void scale(double a){
        X*=a;
        Y*=a;
    }


    public static void main(String[] args) {
        Vector2D v = new Vector2D();
        Vector2D v1 = new Vector2D(1.00, 3.00);
        Vector2D v2 = new Vector2D(v1);
        v.add(v1);
        v.print();
        v.sub(v2);
        v.print();
        System.out.println(v1.length());
        v2.scale(2);
        v2.print();
    }
}
