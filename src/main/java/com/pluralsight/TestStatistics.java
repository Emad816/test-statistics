package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int sum = 0;

        int[] testStatistics = {33, 45, 57, 88, 94, 46, 37, 76, 82, 55};

        for (int num : testStatistics) {
            sum += num;
        }

        double average = (double) sum / testStatistics.length;

        int max = testStatistics[0];
        for (int num : testStatistics) {
            if (num > max) {
                max = num;
            }
        }

        int min = testStatistics[0];
        for (int num : testStatistics) {
            if ( num < min) {
                min = num;
            }
        }

        int[] sorted = Arrays.copyOf(testStatistics, testStatistics.length);
        Arrays.sort(sorted);

        double median;
        if(sorted.length % 2 == 0) {
            median = (sorted[sorted.length / 2 -1] + sorted[sorted.length / 2]) / 2.0;
        }else {
            median = sorted[sorted.length / 2];
        }

        System.out.println("average = " + average);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sorted = " + Arrays.toString(sorted));
        System.out.println("median = " + median);



    }
}
