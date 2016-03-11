package xx.xl.sample.proxy;

public class Jdk {

    public static void main(String[] args) {
        InvocationHandlerImpl InvocationHandlerImpl = new InvocationHandlerImpl();
        ((Interface) InvocationHandlerImpl.bind(new Implement())).method();
    }
}
