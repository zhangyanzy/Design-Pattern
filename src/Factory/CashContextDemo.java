package Factory;

public class CashContextDemo {
    public static void main(String[] args) {

    }

}

class CashContext {
    private CashSuper cashSuper;


    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                CashNormal cashNormal1 = new CashNormal();
                cashSuper = cashNormal1;
                break;
            case "满300减100":
                CashNormal cashNormal2 = new CashNormal();
                cashSuper = cashNormal2;
                break;
            case "打8折扣":
                CashNormal cashNormal3 = new CashNormal();
                cashSuper = cashNormal3;
                break;
            default:
                break;
        }
    }


    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
