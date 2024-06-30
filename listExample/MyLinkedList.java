public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        numNodes++;
    }

    public void addFirst(E element) {
        add(0, element);
    }

    public void addLast(E element) {
        add(numNodes, element);
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.getNext();
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            removedNode = current.getNext();
            current.setNext(removedNode.getNext());
        }
        numNodes--;
        return removedNode.getData();
    }

    public boolean remove(Object element) {
        if (head == null) return false;

        if (head.getData().equals(element)) {
            head = head.getNext();
            numNodes--;
            return true;
        }

        Node<E> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(element)) {
                current.setNext(current.getNext().getNext());
                numNodes--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E element) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(E element) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(element)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public E getFirst() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        return head.getData();
    }

    public E getLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        Node<E> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}
