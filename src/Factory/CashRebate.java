package Factory;

public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return moneyRebate * money;
    }
}
