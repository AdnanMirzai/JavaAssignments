public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x,y);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public String toString() {
        String info = super.toString();
        info += ", radius:" + radius;
        return info;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public void move(int dx, int dy) {
        int temp = getX();
        temp += dx;
        setX(temp);
        temp = getY();
        temp += dy;
        setY(temp);
    }
}
