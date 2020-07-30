package ru.netology.stats;

public class StatsService<currentMax> {


    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static long AverageValueCalculate(long[] sales) {
        int sum = 0;
        for (long a : sales) sum += a;

        return sum / sales.length;
    }

    public long findMax(long[] sales) {
        long maxNumber = sales[0];
        long currentMax = 20;
        int i;
        for (i = 1; i < sales.length; i++) {
            currentMax = Math.max(maxNumber, sales[i]);
        }
        return maxNumber;
    }

    public long findMin(long[] sales) {
        long minNumber = sales[0];
        long currentMin = 7;
        int i;
        for (i = 1; i < sales.length; i++) {
            currentMin = Math.min(minNumber, sales[i]);
        }
        return minNumber;
    }

    public static long moreAverageValue(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
            long b = sum / sales.length;
            long i = 0;
            for (long j = i + 1; j < sales.length; j++) {
                if (sales[(int) j] > b) {
                    sum += j;
                }
            }

        }
        return sum;
    }
    public static long lessAverageValue(int[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
            long b = sum / sales.length;
            long i = 0;
            for (long j = i + 1; j < sales.length; j++) {
                if (sales[(int) j] < b) {
                    sum += j;
                }
            }

        }
        return sum;
    }
}