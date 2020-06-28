package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        StrategyContext context = new StrategyContext(strategy);
        context.strategyMethod();
    }
}
