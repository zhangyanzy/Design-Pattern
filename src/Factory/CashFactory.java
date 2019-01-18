package Factory;

public class CashFactory {

    private CashFactory() {

    }

    public static CashSuper createCashCase(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            default:
                break;
        }
        return cashSuper;
    }
}

class CashFactoryDemo {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashCase("正常收费");
        double totalPrices = 0d;
        totalPrices = cashSuper.acceptCash(100);

    }
}
