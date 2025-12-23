package dev.amit.algoexpert.codingquest.easy.removeduplicatesfromlinkedlist;

public class Solution1 {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(n) time | O(1) space : despite of 2 while loops
    // this is because we have given sorted linkedList
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList nextDistinctNode = currentNode.next;
            while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
                nextDistinctNode = nextDistinctNode.next;
            }
            // we found next distinct node or reached to the end of list
            currentNode.next = nextDistinctNode; // update next pointer to nestDistinct
            currentNode = nextDistinctNode; // Now iterate from next distDistinct
        }
        return linkedList;
    }
}
