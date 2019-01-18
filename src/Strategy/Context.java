package Strategy;

public class Context {


    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.AlgorithmInterface();
    }
}

class ContextMain {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreateStrategyA());
        context.contextInterface();


        context = new Context(new ConcreateStrategyB());
        context.contextInterface();

    }
}
