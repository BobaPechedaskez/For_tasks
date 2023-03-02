 class Circle extends Figure implements Moveable {
    private float radius;
    Circle(float x, float y, float radius){
        super(x, y);
        this.radius=radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI*Math.pow(radius,2));
    }
    @Override
    public float getPerimeter(){
        return (float) (2*Math.PI*radius);
    }

    @Override
    public void move(float dx, float dy) {
        float f = getX()+dx;
        setX(f);
        float f1 = getY()+dy;
        setY(f1);
    }

    @Override
    public void resize(float koeff) {
        radius*=koeff;
    }
    @Override
     public String toString(){
        return "Circle"+"\n"+"Center: "+"("+getX()+","+" "+getY()+")"+"\n"+"Radius: "+radius;
    }
}
