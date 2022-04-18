package Task3;

import java.io.Serializable;


public class TwoWayLinkedListWithHead<E> {
    private class Element implements Serializable {
        E value;
        Element next;
        Element prev;

        public Element(E value) {
            this.value = value;
            next = null;
            prev = null;
        }

        public Element getPrev() {
            return prev;
        }

        public void setPrev(Element prev) {
            this.prev = prev;
        }

        public E getValue() {
            return value;
        }

        public Element getNext() {
            return next;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(Element next) {
            this.next = next;
        }
    }


    //Element ht = new Element(null);
    Element head = null;
    Element tail = null;


    public void add(E element) {
        Element newElem = new Element(element);
        if (head == null) {
            head = newElem;
            tail = newElem;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newElem;
            newElem.prev = tail;
            tail = newElem;
            tail.next = null;

        }
    }
        /*newElem.next=ht; //ustawiamy next aby wskazywal na ht
        newElem.prev=ht.prev; //prev wskazuje na wczesniejszy ostatni
        ht.prev=newElem;
        newElem.prev.next=newElem;*/


    public void print() {
        if (head == null) {
            System.out.println("Lista pusta");
        } else {
            Element temp = head;
            while (temp != null) {
                System.out.println(temp.value.toString());
                temp = temp.getNext();
            }
        }
    }

    public static void main(String[] args) {
        TwoWayLinkedListWithHead list = new TwoWayLinkedListWithHead();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(16);
        list.print();
    }
}
