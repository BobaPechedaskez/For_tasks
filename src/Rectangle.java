class Rectangle extends Figure implements Moveable{
    private float height;
    private float width;
    Rectangle(float x, float y, float height, float width){
        super(x, y);
        this.height = height;
        this.width = width;
    }
    public float getArea(){
        return height*width;
    }
    public float getPerimeter(){
        return 2*height+2*width;
    }
    @Override
    public void move(float dx, float dy){
        float f = getX()+dx;
        setX(f);
        float f1 = getY()+dy;
        setY(f1);
    }
    @Override
    public void resize(float koeff){
        width*=koeff;
        height*=koeff;
    }
    @Override
    public String toString(){
        return "Rectangle"+"\n"+"Center: "+"("+(getX()+getX()+width)/2+","+" "+(getY()+getY()+height)/2+")"+"\n"+"Height: "+height+"\n"+"Width: "+width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 1,1);
        Circle circle = new Circle(10,10,1);
        //System.out.println(rectangle.getPerimeter());
        //System.out.println(circle.getArea());
        //circle.move(5,5);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        circle.resize(2);
        rectangle.resize(2);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        circle.move(2,3);
        rectangle.move(2,3);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);

    }
}