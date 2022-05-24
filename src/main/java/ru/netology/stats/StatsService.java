package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long midSum(long[] sales) {
        long midSum = sum(sales) / sales.length;
        return midSum;
    }

    public long monthiOfMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long monthiOfMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public long monthsMidMinSales(long[] sales) {
        int monthsi = 0;
        for (long sale : sales) {
            if (sale < midSum(sales)) {
                monthsi++;
            }
        }
        return monthsi;
    }

    public long monthsMidMaxSales(long[] sales) {

        int monthsi = 0;
        for (long sale : sales) {
            if (sale > midSum(sales)) {
                monthsi++;
            }
        }
        return monthsi;
    }

}
