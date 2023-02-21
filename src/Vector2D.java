import java.util.Locale;
public class Vector2D {
    public double X;
    public double Y;
    static int count;
    public Vector2D(){
        this.X=1;
        this.Y=1;
        count++;
    }
    public Vector2D(double X, double Y) {
        this.Y = Y;
        this.X = X;
        count++;
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
    public void normalized(){
        double locLength = length();
        double inv_length = (1 / locLength);
        X *= inv_length;
        Y *= inv_length;
    }
    public double dotProduct(Vector2D v){
        X*=v.X;
        Y*=v.Y;
        return X+Y;
    }

    public static void main(String[] args) {
        Vector2D v = new Vector2D();
        Vector2D v1 = new Vector2D(5.00, 7.00);
        Vector2D v2 = new Vector2D(v1);
        v.add(v1);
        v.print();
        v.sub(v2);
        v.print();
        System.out.println(v1.length());
        v2.scale(1.5);
        v2.print();
        v2.normalized();
        System.out.println(v2.length());
        v2.scale(2);
        System.out.println(v.dotProduct(v1));
        System.out.println(count);
    }
}
