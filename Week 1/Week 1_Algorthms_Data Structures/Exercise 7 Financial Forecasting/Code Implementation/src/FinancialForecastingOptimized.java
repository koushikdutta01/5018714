import java.util.HashMap;
import java.util.Map;

public class FinancialForecastingOptimized {

    public static double calculateFutureValue(double presentValue, double growthRate, int periods, Map<Integer, Double> memo) {

        if (periods == 0) {
            return presentValue;
        }


        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }


        double futureValue = calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1, memo);


        memo.put(periods, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double annualGrowthRate = 0.05;
        int years = 10;


        Map<Integer, Double> memo = new HashMap<>();

        double futureValue = calculateFutureValue(presentValue, annualGrowthRate, years, memo);
        System.out.println("The future value of the investment after " + years + " years is: " + futureValue);
    }
}
