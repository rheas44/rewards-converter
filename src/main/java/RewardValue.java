import java.util.Scanner;

public class RewardValue {
    private int rewardValueMiles;
    private double rewardValueCash;
    final double conversionRate = 0.0035;
    public RewardValue(int miles) {
        rewardValueMiles = miles;
    }

    public RewardValue(double cash) {
        rewardValueCash = cash;
    }

    public double getCashValue() {
        return rewardValueMiles * conversionRate;
    }

    public double getMilesValue() {
        return rewardValueCash / conversionRate;
    }

}