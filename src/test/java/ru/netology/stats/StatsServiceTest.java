package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StatsServiceTest {
//    @Test
    @Test
    void sumSales () {
        StatsService service = new StatsService();
        double[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 180;
        double actual = service.sumSales(sales);
        assertEquals(excepted, actual);
    }
    @Test
    void avgSales () {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 15;
        double actual = service.avgSales(sales);
        assertEquals(excepted, actual);
    }
    @Test
    void monthMinSales () {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 9;
        double actual = service.monthMinSales(sales);
        assertEquals(excepted, actual);
    }
    @Test
    void monthMaxSales () {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 8;
        double actual = service.monthMaxSales(sales);
        assertEquals(excepted, actual);
    }
    @Test
    void countMonthMinSales () {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 5;
        double actual = service.countMonthMinSales(sales);
        assertEquals(excepted, actual);
    }
    @Test
    void countMonthMaxSales () {
        StatsService service = new StatsService();
        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double excepted = 5;
        double actual = service.countMonthMaxSales(sales);
        assertEquals(excepted, actual);
    }
}
