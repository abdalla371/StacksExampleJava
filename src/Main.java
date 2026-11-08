

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //Push and print a stack
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.toString());


        //peek() looks, pop() takes
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Original Stack: " + s1.toString());
        int top = s1.peek();
        System.out.println("top element: " + top);
        System.out.println("Stack after accessing top element: " + s1);
        int out = s1.pop();
        System.out.println("Removed element: " + out);
        System.out.println("Stack after Pop Operation: " + s1);


        //GENERICS
        Box<Integer> box1 = new Box<Integer>(); // only Integers
        box1.set(25);
        int age = box1.get(); // no cast needed
        Box<String> box2 = new Box<String>(); // only Strings
        box2.set("Ali");
        String name = box2.get();
         // box1.set("Ali"); // COMPILE ERROR: String is not an Integer
        System.out.println("box1 holds " + age);
        System.out.println("box2 holds " + name);



        //Reverser
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter String to Reverse: ");

        String input = inputObject.nextLine();
        Reverser test = new Reverser();
        String result = test.reverse(input);
        System.out.println("Reversed String: " + result);



        //EmptyCollectionException
        try {
            throw new EmptyCollectionException("stack");
        } catch (EmptyCollectionException e) {
            System.out.println("Caught: " + e.getMessage());
        }




        //LinkedStack
            Node<String> head=new Node<>("Abdalla");


            Node<String> s2=new Node<>("Mohamed");
            Node<String> s3=new Node<>("Keynan");
            Node<String> s4=new Node<>("Faarax");
            Node<String> s5=new Node<>("Ali");
            head.setNext(s2);
            s2.setNext(s3);
            s3.setNext(s4);

            Node<String> current=head;
            while (current!=null){
                System.out.println(current.getElement());
                current=current.getNext();

        }
    }
}

//GENERICS
class Box<T> {
    private T item;
    public void set(T item) { this.item = item; }
    public T get() { return item; }
}
