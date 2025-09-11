/*/
Normally we would need to implement move method from Movable but because Shape is abstract, we won't need to
However we need to implement it in the subclasses Circle and Rectangle!
/*/

public abstract class Shape implements Movable {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    @Override
    public String toString() {
        return "x:" + x + ", y:" + y;
    }

    //Abstract method
    public abstract void draw();
}
