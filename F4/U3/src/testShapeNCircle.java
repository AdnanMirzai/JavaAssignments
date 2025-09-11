public class testShapeNCircle {
    public static void main(String[] args) {

        //If interface is implemented in abstract class, and methods exist in subclass
        //interface objects can be used to hold all subclass types!
        Movable[] movables = new Movable[2];
        Circle c = new Circle(1,2,3);
        movables[0] = c;
        movables[1] = new Rectangle();

        for (Movable movable : movables) {
            movable.move(20, 1);
            System.out.println(movable.toString());
        }

    }
}
