package designPattern.prototype;

public interface IAircraflPrototype {
    void fly();
    IAircraflPrototype clone();
    void setEngine(F16Engine f16Engine);
}
