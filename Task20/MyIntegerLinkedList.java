package task20;

public class MyIntegerLinkedList {
    IntegerNode firstNode;
    int size;

    public MyIntegerLinkedList() {
        size = 0;
    }

    public void add(int index, int element) throws IndexOutOfBoundsException {
        if (index == 0) {
            firstNode = new IntegerNode(element, firstNode);
            size++;
        } else if (isIndexValid(index)) {
            IntegerNode integerNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                integerNode = integerNode.nextNode;
            }
            integerNode.nextNode = new IntegerNode(element, integerNode.nextNode);
            size++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int index) throws IndexOutOfBoundsException {
        if (isIndexValid(index)) {
            IntegerNode integerNode = firstNode;
            for (int i = 0; i < index; i++) {
                integerNode = integerNode.nextNode;
            }
            return integerNode.element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(int index, int element) throws IndexOutOfBoundsException {
        if (isIndexValid(index)) {
            IntegerNode integerNode = firstNode;
            for (int i = 0; i < index; i++) {
                integerNode = integerNode.nextNode;
            }
            integerNode.element = element;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException {
        if (isIndexValid(index)) {
            IntegerNode integerNode = firstNode;
            if (index == 0) firstNode = integerNode.nextNode;
            else {
                for (int i = 0; i < index - 1; i++) {
                    integerNode = integerNode.nextNode;
                }
                integerNode.nextNode = integerNode.nextNode.nextNode;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isIndexValid(int index) {
        return index >= 0 && index < size;
    }

    public String toString() {
        String toString = "[";
        IntegerNode integerNode = firstNode;
        for (int i = 0; i < size - 2; i++) {
            toString += integerNode.element + ", ";
            integerNode = integerNode.nextNode;
        }
        toString += integerNode.element + "]";
        return toString;
    }
}
