package behavioral.observer;

public class ConcreteObserver1 extends Observer {

    public ConcreteObserver1(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("观察者1收到通知");
    }
}
