public class Rectangle extends Shape {
    public int x2;
    public int y2;

    public Rectangle(int x, int y, int x2, int y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle() {
        super();
        this.x2 = 0;
        this.y2 = 0;
    }

    public int getX2() { return x2; }
    public int getY2() {return y2; }

    public void setX2(int x2) { this.x2 = x2; }
    public void setY2(int y2) { this.y2 = y2; }

    @Override
    public String toString() {
        String info = super.toString();
        info += ", x2:" + x2 + ", y2:" + y2;
        return info;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public void move(int dx, int dy) {
        x2 += dx;
        y2 += dy;

        int temp = getX();
        temp += dx;
        setX(temp);
        temp = getY();
        temp += dy;
        setY(temp);
    }
}
