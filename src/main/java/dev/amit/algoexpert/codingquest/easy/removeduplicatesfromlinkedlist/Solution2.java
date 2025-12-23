package dev.amit.algoexpert.codingquest.easy.removeduplicatesfromlinkedlist;

public class Solution2 {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public Solution2.LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(n) time | O(1) space
    public Solution2.LinkedList removeDuplicatesFromLinkedList(Solution2.LinkedList linkedList) {
        Solution2.LinkedList currentNode = linkedList;
        Solution2.LinkedList nextNode;
        if (currentNode == null) {
            return null;
        }
        while(currentNode.next != null){
            nextNode = currentNode.next;
            if (currentNode.value == nextNode.value) {
                currentNode.next = nextNode.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        return linkedList;
    }
}
