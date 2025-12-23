package dev.amit.algoexpert.codingquest.easy.removeduplicatesfromlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1Test {
    public Solution1.LinkedList addMany(
            Solution1.LinkedList ll, List<Integer> values
    ) {
        Solution1.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new Solution1.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(Solution1.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        Solution1.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void removeDuplicatesFromLinkedList() {
        Solution1.LinkedList input = new Solution1.LinkedList(1);
        addMany(
                input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6))
        );
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        Solution1.LinkedList output = new Solution1().removeDuplicatesFromLinkedList(input);
        assertEquals(getNodesInArray(output), expectedNodes);
    }
}