package src.DataStructures.LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(0);
        linkedList.display();
        linkedList.delete(2);
        linkedList.display();
    }
}
