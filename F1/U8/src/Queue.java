public class Queue {
    private String[] queue;
    private int nrOfElements;

    public Queue(int size) {
        this.queue = new String[size];
        this.nrOfElements = 0;
    }

    public Queue() {
        this.queue = new String[10];
        this.nrOfElements = 0;
    }

    public int getNrOfElements() {
        return this.nrOfElements;
    }

    public String[] getAll() {
        String[] temp = new String[nrOfElements];
        for(int i=0; i<nrOfElements; i++) {
            temp[i] = queue[i];
        }
        return temp;
    }

    public String peek() {
        return queue[0];
    }

    public boolean isEmpty() {
        return this.nrOfElements == 0;
    }

    public void add(String newElement) {
        if(nrOfElements >= queue.length) resize();
        queue[nrOfElements] = newElement;
        nrOfElements++;
    }

    public String remove() {
        String temp;
        if (this.nrOfElements == 0) return null;
        else {
            temp = this.queue[0];
            pack();
        }
        return temp;
    }

    private void resize() {
        String[] temp = new String[this.queue.length * 2];
        for(int i = 0; i<this.nrOfElements; i++) {
            temp[i] = this.queue[i];
        }
        this.queue = temp;
    }

    private void pack() {
        for (int i = 0; i < this.nrOfElements-1; i++) {
            this.queue[i] = this.queue[i + 1];
        }
        this.nrOfElements--;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for(int i=0; i<nrOfElements; i++) {
            info.append("[");
            info.append(queue[i]);
            info.append("] ");
        }
        return info.toString();
    }
}