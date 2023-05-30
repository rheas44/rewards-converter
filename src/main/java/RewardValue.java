public class RewardValue {
    private final double cashValue;
    public static final double CONVERSION_RATE_MILES_TO_CASH = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * CONVERSION_RATE_MILES_TO_CASH;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return (int)(this.cashValue / CONVERSION_RATE_MILES_TO_CASH);
    }
}