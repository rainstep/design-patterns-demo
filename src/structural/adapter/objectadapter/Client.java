package structural.adapter.objectadapter;


public class Client {
    public static void main(String[] args) {
        // 普通请求
        Target target = new GeneralTarget();
        target.request();;
        // 特殊请求
        Adaptee adaptee = new Adaptee();
        Target target2 = new ObjectAdapter(adaptee);
        target2.request();
    }
}
