public class RewardValue {
    private final double cashValue;
    public static final double miles_to_cash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / miles_to_cash);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * miles_to_cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}