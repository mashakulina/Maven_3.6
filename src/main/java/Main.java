import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService sale = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumSales = sale.sum(sales);
        System.out.println("1. Сумма всех продаж: " + sumSales);

        long midSum = sale.midSum(sales);
        System.out.println("2. Средняя сумма всех продаж в месяц: " + midSum);

        long monthiOfMaxSales = sale.monthiOfMaxSales(sales);
        System.out.println("3. Номер месяца, в котором был пик продаж: " + monthiOfMaxSales);

        long monthiOfMinSales = sale.monthiOfMinSales(sales);
        System.out.println("4. Номер месяца, в котором был минимум продаж: " + monthiOfMinSales);

        long midMinSales = sale.monthsMidMinSales(sales);
        System.out.println("5. Кол-во месяцев, в которых продажи были ниже среднего: " + midMinSales);

        long midMaxSales = sale.monthsMidMaxSales(sales);
        System.out.println("6. Кол-во месяцев, в которых продажи были выше среднего: " + midMaxSales);


    }

}
