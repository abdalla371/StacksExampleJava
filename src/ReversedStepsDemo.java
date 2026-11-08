import static java.lang.IO.print;

void main() {
    Node<String> head = new Node<>("B");
    Node<String> newNode = new Node<>("A");
    newNode.setNext(head); // 1. link
    head = newNode; // 2. move head
    print("Correct: ", head);

    //Swapped
    head = new Node<>("B");
    newNode = new Node<>("A");
    head = newNode; // 2. move head (B is now unreachable!)
    newNode.setNext(head); // 1. link (A points to itself)
    print("Swapped: ", head);
}

private void print(String label, Node<String> head) {
    System.out.println(label);
    Node<String> current=head;
    for(int i=0;i<5 && current!=null;i++){
        System.out.println(current.getElement()+"->");
        current=current.getNext();
    }
    System.out.println(current == null ? "null" : "...");
}

public class ReversedStepsDemo {
    static void print(String label,Node<String> head){
        System.out.println(label);
        Node<String> current=head;
        for(int i=0;i<5 && current!=null;i++){
            System.out.println(current.getElement()+"->");
            current=current.getNext();
        }
        System.out.println(current == null ? "null" : "...");
    }
}
