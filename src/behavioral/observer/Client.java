package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        new ConcreteObserver1(subject);
        new ConcreteObserver2(subject);
        subject.setState(1);
    }
}
