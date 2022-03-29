package hard.linked_lists.reverse_linked_list;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitgade on 30-Mar-2022
 */
public class SolutionTest {
    @Test
    public void TestCase1() {
        Solution.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        List<Integer> result = toArrayList(Solution.reverseLinkedList(test));
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
        Assert.assertTrue(arraysEqual(result, expected));
    }

    public Solution.LinkedList newLinkedList(int[] values) {
        Solution.LinkedList ll = new Solution.LinkedList(values[0]);
        Solution.LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new Solution.LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> toArrayList(Solution.LinkedList ll) {
        List<Integer> arr = new ArrayList<Integer>();
        Solution.LinkedList current = ll;
        while (current != null) {
            arr.add(current.value);
            current = current.next;
        }
        return arr;
    }

    public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) return false;
        }
        return true;
    }
}