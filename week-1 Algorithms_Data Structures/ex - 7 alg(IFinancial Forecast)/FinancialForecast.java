public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValueRecursive(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValueRecursive(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Iterative (optimized) method to calculate future value
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }
        return currentValue;
    }

    public static void main(String[] args) {
        double currentValue = 10000.0; // Starting amount
        double growthRate = 0.05; // 5% annual growth
        int years = 5;

        // Using recursion
        double futureValueRecursive = calculateFutureValueRecursive(currentValue, growthRate, years);
        System.out.printf("Recursive: Future value after %d years = ₹%.2f\n", years, futureValueRecursive);

        // Using iteration
        double futureValueIterative = calculateFutureValueIterative(currentValue, growthRate, years);
        System.out.printf("Iterative: Future value after %d years = ₹%.2f\n", years, futureValueIterative);
    }
}
