import java.util.EmptyStackException;


public class LinkedStack<T>{
    private int count;
    private Node<T>top;
    LinkedStack(){
        count=0;
        top=null;
    }
    public void push(T Element){
        Node<T> temp=new Node<>(Element);
        temp.setNext(top);
        top=temp;
        count++;
    }
    public T pop() throws EmptyStackException{
       if(isEmpty()) throw new EmptyStackException();
       T result= top.getElement();
       top=top.getNext();
       count--;
       return result;
    }
    public Boolean isEmpty(){
        return count==0;
    }
    public T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getElement();
    }
    public int size() { return count; }

}


