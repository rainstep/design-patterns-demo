package behavioral.observer;

public class ConcreteSubject extends Subject {
    private int state;

    public void setState(int state) {
        this.state = state;
        System.out.println("被观察者状态发生改变，发起通知：");
        this.notifyObserver();
    }
}
