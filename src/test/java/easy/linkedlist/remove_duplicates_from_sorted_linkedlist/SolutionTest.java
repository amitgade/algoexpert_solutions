package easy.linkedlist.remove_duplicates_from_sorted_linkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amitgade on 20-Feb-2022
 */
public class SolutionTest {
    public Solution.LinkedList addMany(Solution.LinkedList ll, List<Integer> values) {
        Solution.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new Solution.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(Solution.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        Solution.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        Solution.LinkedList input = new Solution.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        Solution.LinkedList output = new Solution().removeDuplicatesFromLinkedList(input);
        Assert.assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}