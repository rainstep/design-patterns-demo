package structural.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        // 普通请求
        Target target = new GeneralTarget();
        target.request();;
        // 特殊请求
        Target target2 = new ClassAdapter();
        target2.request();
    }
}
