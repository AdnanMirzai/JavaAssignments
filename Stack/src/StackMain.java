public class StackMain {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push("jag");
        s1.push("Ar");
        s1.push("En");
        s1.push("Stack");
        System.out.println(s1.toString());

        s1.pop();
        s1.pop();
        System.out.println(s1.toString());
        System.out.println(s1.pop());
        System.out.println(s1.toString());

        System.out.println("Current size: " + s1.getSize());
        System.out.println("At the top: " + s1.peek());
        System.out.println("Is it empty? " + s1.isEmpty());
        System.out.println(s1.toString());
    }
}
