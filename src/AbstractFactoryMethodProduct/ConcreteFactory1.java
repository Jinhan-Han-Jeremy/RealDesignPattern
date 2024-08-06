package AbstractFactoryMethodProduct;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public Product createProductB() {
        return new ConcreteProductB1();
    }
}
