package structural.proxy;

public class Proxy implements Subject {
    private Subject subject;

    public Proxy() {
        subject = new RealSubject();
    }

    private void preRequest() {
        System.out.println("前置请求");
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        afterRequest();
    }

    private void afterRequest() {
        System.out.println("后置请求");
    }
}
