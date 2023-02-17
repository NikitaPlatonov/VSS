public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int Calculation (int [] countSales) {
        int count = 0;
        int max = 0;
        int min = countSales[0];
        int countSum = 0;
        for (int i = 0; i < countSales.length; i++) {
            if (countSales[i] > max) {
                max = countSales[i];
            }
            if (countSales[i] < min) {
                min = countSales[i];
            }
            count++;
            countSum += countSales[i];
        }
        int CalculationResult = ((countSum - (max + min)) / count);
        return CalculationResult;
    }
}
