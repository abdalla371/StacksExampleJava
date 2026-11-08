
    public class Node<T>{
        private T Element;
        private Node<T> Next;
        Node(){
            Element=null;
            Next=null;
        }
        Node(T Element){
            this.Element=Element;
            Next=null;
        }

        public T getElement() {
            return Element;
        }

        public void setElement(T element) {
            Element = element;
        }

        public Node<T> getNext() {
            return Next;
        }

        public void setNext(Node<T> next) {
            Next = next;
        }
    }

