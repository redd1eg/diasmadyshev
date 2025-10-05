package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void testSortedArray() {
        int[] arr = {1, 2, 3, 4};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    void testReverseArray() {
        int[] arr = {5, 4, 3, 2, 1};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {3, 3, 3};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{3, 3, 3}, arr);
    }

    @Test
    void testRandomArray() {
        int[] arr = {4, 1, 3, 2};
        new InsertionSort().sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }
}
