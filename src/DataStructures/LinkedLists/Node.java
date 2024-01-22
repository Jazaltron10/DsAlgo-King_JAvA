//package src.DataStructures.LinkedLists;
//
//class Node {
//    int item;
//    Node next;
//
//    Node(int item) {
//        this.item = item;
//        next = null;
//    }
//
//    public void runThrough() {
//        Node head = null;
//        Node runner = head;
//        while (runner != null) {
//            System.out.println(runner.item);
//            runner = runner.next;
//        }
//    }
//
//    /**
//     * Compute the sum of all the integers in a linked list of integers.
//     *
//     * @param head a pointer to the first node in the linked list
//     */
//    public static int addItemsInList(Node head) {
//        if (head == null) {
//            // Base case: The list is empty, so the sum is zero.
//            return 0;
//        } else {
//            // Recursive case: The list is non-empty. Find the sum of
//            // the tail list, and add that to the item in the head node.
//            // (Note that this case could be written simply as
//            // return head.item + addItemsInList( head.next );)
//            int listsum = head.item;
//            int tailsum = addItemsInList(head.next);
//            listsum = listsum + tailsum;
//            return listsum;
//        }
//    }
//}