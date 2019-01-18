package Strategy;

public class ConcreateStrategyA extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法A");
    }
}

class ConcreateStrategyB extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B");
    }
}

class ConcreateStrategyC extends Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C");
    }
}
