package ru.netology.stats;

public class StatsService {
    public double sumSales (double[] sales) {
        double sum = 0;
        int month = 0;
        for (int i = month; sales.length > month; i++) {
            sum = sum + sales[month];
            month++;
        }
        return sum;
    }
    public double avgSales (double[] sales) {
        double sum = 0;
        int month = 0;
        double avgSum = 0;
        for (int i = month; sales.length > month; i++) {
            sum = sum + sales[month];
            month++;
        }
        avgSum = sum / month;
        return avgSum;
    }
    public int monthMinSales(double[] sales) {
        int monthMinSales = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale <= sales[monthMinSales]) {
                monthMinSales = month;
            }
            month = month + 1;
        }
        return monthMinSales + 1;
    }
    public int monthMaxSales(double[] sales) {
        int monthMaxSales = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale >= sales[monthMaxSales]) {
                monthMaxSales = month;
            }
            month = month + 1;
        }
        return monthMaxSales + 1;
    }
    public int countMonthMinSales(double[] sales) {
        int month = 0;
        int countMonthMinSales = 0;
        for (double sale : sales) {
            if (sale < avgSales(sales)) {
                countMonthMinSales++;
            }
            month = month + 1;
        }
        return countMonthMinSales;
    }
    public int countMonthMaxSales(double[] sales) {
        int month = 0;
        int countMonthMaxSales = 0;
        for (double sale : sales) {
            if (sale > avgSales(sales)) {
                countMonthMaxSales++;
            }
            month = month + 1;
        }
        return countMonthMaxSales;
    }
}
