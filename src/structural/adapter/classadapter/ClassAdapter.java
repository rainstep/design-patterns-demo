package structural.adapter.classadapter;

/**
 * 类适配器
 * Adapter类继承Adaptee（被适配类），同时实现Target 接口（因为 Java 不支持多继承，所以只能通过接口的方法来实现多继承）
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
