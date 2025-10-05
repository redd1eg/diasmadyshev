package metrics;

public class PerformanceTracker {
    private long comparisons;
    private long swaps;
    private long arrayAccesses;
    private long startTime;
    private long endTime;
    private String note = "";

    public void reset() {
        comparisons = swaps = arrayAccesses = 0;
        note = "";
    }

    public void startTimer() {
        startTime = System.nanoTime();
    }

    public void stopTimer() {
        endTime = System.nanoTime();
    }

    public void incrementComparisons() { comparisons++; }
    public void incrementSwaps() { swaps++; }
    public void incrementArrayAccesses(int count) { arrayAccesses += count; }

    public void addNote(String n) { note = n; }

    public void printReport(int n) {
        System.out.printf("""
                Input size: %d
                Comparisons: %d
                Swaps: %d
                Array accesses: %d
                Execution time (ns): %d
                Note: %s
                -----------------------------
                """, n, comparisons, swaps, arrayAccesses, (endTime - startTime), note);
    }
}
