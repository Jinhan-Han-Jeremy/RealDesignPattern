package AbstractFactoryMethodProduct;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB2();
    }
}