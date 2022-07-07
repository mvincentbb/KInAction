package dataStructure.stack;

public class Stack {
    private int arr[];
    private int top, capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()){
            System.out.println(" Overflow \n Program Terminated \n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow \n Program Terminated \n");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    public int peek(){
        if (!isEmpty()){
            return arr[top];
        }else{
            System.exit(-1);
        }
        return -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }
}
