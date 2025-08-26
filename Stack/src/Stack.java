public class Stack {
    private final int SIZE = 2;
    private String[] elements;
    private int top;

    public Stack() {
        elements = new String[SIZE];
        top = 0;
    }

    public void push(String element) {
        if(this.top>=elements.length) expand();
        this.elements[this.top] = element;
        this.top++;
    }

    public String pop() {
        if(top==0) throw new RuntimeException("STACK IS EMPTY!");

        String buffer = this.elements[top-1];
        this.elements[top-1] = null;
        this.top--;
        return buffer;
    }

    public int getSize() {return this.top;}

    public boolean isEmpty() {
        return this.top == 0;
    }

    public String peek() {
        if(top==0) throw new RuntimeException("STACK IS EMPTY!");
        return this.elements[this.top-1];
    }

    private void expand() {
        String[] temp = new String[SIZE*2];
        for(int i=0; i<this.top; i++) {
            temp[i] = this.elements[i];
        }
        this.elements = temp; //The ref variable "elements" is now referring to temp which is twice as large + contains what elements[] originally contained.
    }

    @Override
    public String toString() {
       StringBuilder buffer = new StringBuilder();
         for (int i=top-1; i>=0; i--) {
             buffer.append("[").append(elements[i]).append("]");
         }
         return buffer.toString();
    }
}