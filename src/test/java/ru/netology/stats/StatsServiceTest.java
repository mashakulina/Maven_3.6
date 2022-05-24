package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumSales() {
        StatsService sale = new StatsService();

        long actual = sale.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void midSum() {
        StatsService sale = new StatsService();

        long actual = sale.midSum(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthiOfMaxSales() {
        StatsService sale = new StatsService();

        long actual = sale.monthiOfMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void monthiOfMinSales() {
        StatsService sale = new StatsService();

        long actual = sale.monthiOfMinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void midMinSales() {
        StatsService sale = new StatsService();

        long actual = sale.monthsMidMinSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void midMaxSales() {
        StatsService sale = new StatsService();

        long actual = sale.monthsMidMaxSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }


}
