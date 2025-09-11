public class testShapeNCircle {
    public static void main(String[] args) {
        Shape myShape = new Shape(10, 20);
        System.out.println(myShape.toString());

        Circle myCircle = new Circle(20, 40, 5);
        System.out.println(myCircle.toString());
        System.out.println(myCircle.getX());
        myCircle.setY(9000);
        System.out.println("OVER" + myCircle.getY());
        myCircle.setX(0);
        System.out.println(myCircle.getX());
        System.out.println(myCircle.toString());

        Circle c = new Circle(20, 20, 20); //POLYMORPHISM, circle is a shape, therefor we can upcast!
        Shape cs = c;
        System.out.println(c.toString());
    }
}
