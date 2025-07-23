public class Forecast {


    public static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double predictValueDP(double currentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != 0) return memo[years];

        memo[years] = predictValueDP(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
