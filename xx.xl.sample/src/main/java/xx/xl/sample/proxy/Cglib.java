package xx.xl.sample.proxy;

public class Cglib {

    public static void main(String[] args) {
        CglibProxy cglib = new CglibProxy();
        Implement imp = (Implement) cglib.getInstance(new Implement());
        imp.method();
    }
}
