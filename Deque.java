class Dequeue{
    int arr[];
    int capacity;
    int size;
    int front;
    int rear;
  

    Dequeue(int capacity){
        this.capacity=capacity;
        arr= new int[capacity];
        size=0;
        front=0;
        rear=-1;
    }

    boolean isFull(){
        return size==capacity;
    }
    boolean isEmpty(){
        return size==0;
    }
    void insertAtFront(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return ;
        }
        front =(front-1+capacity)%capacity;
        arr[front]=value;
        size++;
        if(rear==-1){
            rear=front;
        }
    }
}   
public class Deque{
    public static void main(String [] args){
       Dequeue d=new Dequeue( 5);
       System.out.println("hello");
    }
    
}