package dev.amit.algoexpert.codingquest.easy.removeduplicatesfromlinkedlist;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public static class LinkedList {
        public int value;
        public Solution3.LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // O(n) time | O(n) space -> This is brute-force approach
    public Solution3.LinkedList removeDuplicatesFromLinkedList(Solution3.LinkedList linkedList) {
        Set<Integer> values = new HashSet<>();
        Solution3.LinkedList previous = null;
        Solution3.LinkedList current = linkedList;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
        return linkedList;
    }
}
