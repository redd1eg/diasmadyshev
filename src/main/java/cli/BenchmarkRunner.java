package cli;

import algorithms.InsertionSort;

import java.util.Random;
import java.util.Scanner;

public class BenchmarkRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new Random().ints(n, 0, 100000).toArray();

        InsertionSort sorter = new InsertionSort();
        sorter.getTracker().startTimer();
        sorter.sort(arr);
        sorter.getTracker().stopTimer();
        sorter.getTracker().printReport(n);
    }
}
