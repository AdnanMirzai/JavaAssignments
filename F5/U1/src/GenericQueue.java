public class GenericQueue<T> {

        private T[] queue;
        private int nrOfElements;

        public GenericQueue(int size) {
            if(size<=0) throw new IllegalArgumentException("Positive size needed");

            //noinspection unchecked
            this.queue = (T[]) new Object[size];
            this.nrOfElements = 0;
        }

        public GenericQueue() {
            this(10);
        }

        public int getNrOfElements() {
            return this.nrOfElements;
        }

        public Object[] getAll() {
            Object[] temp = new Object[nrOfElements];

            System.arraycopy(queue, 0, temp, 0, nrOfElements);
            return temp;
        }

        public T peek() {
            if (isEmpty()) return null;
            return queue[0];
        }

        public boolean isEmpty() {
            return this.nrOfElements == 0;
        }

        public void enqueue(T newElement) {
            if(nrOfElements >= queue.length) resize();
            queue[nrOfElements] = newElement;
            nrOfElements++;
        }

        public T dequeue() {
            T temp;
            if (this.nrOfElements == 0) return null;
            else {
                temp = this.queue[0];
                pack();
            }
            return temp;
        }

        private void resize() {
            @SuppressWarnings("unchecked")
            T[] temp = (T[]) new Object[this.queue.length * 2];
            if (this.nrOfElements >= 0)
                System.arraycopy(this.queue, 0, temp, 0, this.nrOfElements);
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
            info.append("Contents: ");
            for(int i=0; i<nrOfElements; i++) {
                info.append("[");
                info.append(queue[i]);
                info.append("] ");
            }
            return info.toString();
        }
    }