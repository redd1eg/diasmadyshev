package algorithms;

import metrics.PerformanceTracker;

public class InsertionSort {

    private final PerformanceTracker tracker = new PerformanceTracker();

    /**
     * Sorts an array using optimized insertion sort.
     * Optimization: early exit for nearly-sorted data (if no swaps occur in a pass).
     */
    public void sort(int[] arr) {
        tracker.reset();
        if (arr == null || arr.length <= 1) return;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            boolean swapped = false;

            // Move elements greater than key to one position ahead
            while (j >= 0) {
                tracker.incrementComparisons();
                tracker.incrementArrayAccesses(2);

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    tracker.incrementSwaps();
                    swapped = true;
                    j--;
                } else {
                    break;
                }
            }

            tracker.incrementArrayAccesses(1);
            arr[j + 1] = key;

            // Optimization: early exit if no swaps in pass (almost sorted array)
            if (!swapped && i == arr.length - 1) {
                tracker.addNote("Early termination on nearly-sorted array at i=" + i);
                break;
            }
        }
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }
}
