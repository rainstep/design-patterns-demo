package behavioral.observer;

public class ConcreteObserver2 extends Observer {

    public ConcreteObserver2(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("观察者2收到通知");
    }
}
