package structural.adapter.objectadapter;

public class GeneralTarget implements Target {
    @Override
    public void request() {
        System.out.println("普通请求");
    }
}
