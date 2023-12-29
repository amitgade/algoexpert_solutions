package hard.linked_lists.reverse_linked_list;

/**
 * Created by amitgade on 30-Mar-2022
 */
public class Solution {
    // O(n) time | O(1) space
    public static LinkedList reverseLinkedList(LinkedList head) {

        LinkedList current = head;
        LinkedList previous = null;

        while (current != null) {
            LinkedList next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
