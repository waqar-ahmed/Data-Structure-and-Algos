package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/4/2018.
 */

class Node{
    Node next;
    Object data;

    public Node(Object data){
        this.next = null;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedList {

    Node head = null;
    Node tail=  null;
    int size = 0;

    public LinkedList(){

    }

    public void add(int data){
        Node n = new Node(data);
        if(size == 0) {
            head = n;
        }
        else{
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(n);
        }
        tail = n;
        size++;
    }

    public Object get(int index){
        if(index >= size) return null;

        Node current = head;
        while(current != null && index-- != 0){
            //System.out.println(current.getData());
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index){
        if(index >= size) return false;
        if (index == 0){
            head = head.getNext();
            size--;
            return true;
        }
        Node current = head;
        while(current != null && --index != 0){  // stop one index before the index to delete the node and then change the pointer.
            //System.out.println(current.getData());
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
        return true;
    }


    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }


    public static void main( String[] args ) {

        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.print();
        //System.out.println(l.get(4));
        System.out.println("-----------------------");
        l.remove(2);
        l.print();

    }
}


