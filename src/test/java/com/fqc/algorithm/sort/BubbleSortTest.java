package com.fqc.algorithm.sort;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void main() throws Exception {
        int[] arr = {1, 3, 5, 2, 4, 6};

        int[] sorted_arr = BubbleSort.sort(arr);
        for (int element : sorted_arr) {
            System.out.println(element);
        }

    }
}