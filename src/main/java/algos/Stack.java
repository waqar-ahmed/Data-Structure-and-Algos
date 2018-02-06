package algos;

/**
 * Created by waqar on 2/5/2018.
 */
public class Stack {
    int arr[];
    int size = 0;
    int pointer = -1;

    public Stack(){
        size = 10;
        arr = new int[size];
    }

    public Stack(int size){
        this.size = size;
        arr = new int[size];
    }

    public void push(int data){
        if(pointer < size)
            arr[++pointer] = data;
    }

    public int pop(){
        return arr[pointer--];
    }

    public boolean isEmpty(){
        if(pointer == -1) return true;
        return false;
    }

    public int top(){
        return arr[pointer];
    }

    public boolean isFull(){
        return (pointer+1 == size);
    }

    public void printStack(){
        while(!isEmpty()){
            print(pop());
        }
    }

    public static void print(Object s){
        System.out.println(s);
    }

    public static void main(String args[]){
        Stack s = new Stack(5);
        int i = 1;
        while(!s.isFull()){
            s.push(i);
            i++;
        }
        s.printStack();
    }
}
