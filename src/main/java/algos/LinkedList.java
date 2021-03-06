package algos;

import java.util.Arrays;

/**
 * Created by waqar on 2/4/2018.
 */

class Node{
    Node next;
    int data;

    public Node(int data){
        this.next = null;
        this.data = data;
    }

    public int getData() {
        return data;
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

    public void reverse(){
        Node currNode = head;
        Node nextNode = null;
        Node prevNode = null;

        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }


    public static void main( String[] args ) {

        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        //l.add(5);
        l.print();
        //System.out.println(l.get(4));
        System.out.println("-----------------------");
        /*
        l.remove(2);
        l.print();
        System.out.println("-----------------------");
        */

        l.reverse();
        l.print();

        System.out.println("Middle Element");
        Node fast = l.head;
        Node slow = l.head;

        while(fast != null && fast.getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        System.out.println(slow.getData());




    }
}


