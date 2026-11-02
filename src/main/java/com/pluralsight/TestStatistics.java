package com.pluralsight;

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

        System.out.println(average);
        System.out.println(max);
        System.out.println(min);




    }
}
