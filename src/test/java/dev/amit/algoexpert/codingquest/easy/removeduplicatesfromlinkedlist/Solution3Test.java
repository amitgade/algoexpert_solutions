package dev.amit.algoexpert.codingquest.easy.removeduplicatesfromlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution3Test {

    public Solution3.LinkedList addMany(Solution3.LinkedList ll, List<Integer> values) {
        Solution3.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new Solution3.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(Solution3.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        Solution3.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void removeDuplicatesFromLinkedList() {
        Solution3.LinkedList input = new Solution3.LinkedList(1);
        addMany(
                input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6))
        );
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        Solution3.LinkedList output = new Solution3().removeDuplicatesFromLinkedList(input);
        assertEquals(getNodesInArray(output), expectedNodes);
    }
}