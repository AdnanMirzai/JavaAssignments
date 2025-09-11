public class testShapeNCircle {
    public static void main(String[] args) {
        //Shape myShape = new Shape(10, 20); Abstrakta klasser kan inte bli objekt! Så detta är olagligt
        Shape myShape = new Circle(3.14);
        Shape myShape2 = new Rectangle();
        myShape.draw();
        myShape2.draw(); //POLYMORPHISM, shape can be both Circle and Rectangle if the class is abstract!!!
    }
}
