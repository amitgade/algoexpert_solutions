package easy.linkedlist.remove_duplicates_from_sorted_linkedlist;

/**
 * Created by amitgade on 20-Feb-2022
 */
public class Solution {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(n) time | O(n) space : despite of 2 while loop
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList nextDistinctNode = currentNode.next;

            while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
                nextDistinctNode = nextDistinctNode.next;
            }

            // we found next distinct node or reached to the end
            currentNode.next = nextDistinctNode; // pointing to next distinct
            currentNode = nextDistinctNode;      // now iterate from next distinct
        }
        return linkedList;
    }
}
