public class Main {
    public static void main(String[] args) {
        double currentValue = 10000.0;  // initial investment
        double growthRate = 0.08;       // 8% annual growth
        int years = 5;                  // forecast for 5 years

        // Simple recursion
        double forecast = Forecast.predictValue(currentValue, growthRate, years);
        System.out.printf("📈 Forecasted Value after %d years: ₹%.2f\n", years, forecast);

        // Optimized recursion with memoization
        double[] memo = new double[years + 1];
        double forecastMemo = Forecast.predictValueDP(currentValue, growthRate, years, memo);
        System.out.printf("⚡ Optimized Forecast: ₹%.2f\n", forecastMemo);
    }
}
