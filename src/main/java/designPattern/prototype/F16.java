package designPattern.prototype;

public class F16 implements IAircraflPrototype{

    F16Engine f16Engine = new F16Engine();

    @Override
    public void fly() {
        System.out.println("F-16");
    }

    @Override
    public IAircraflPrototype clone() {
        return null;
    }

    @Override
    public void setEngine(F16Engine f16Engine) {

    }
}
