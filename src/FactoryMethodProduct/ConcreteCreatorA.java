package FactoryMethodProduct;

// ConcreteCreatorA 클래스 - Creator 클래스를 확장하여 ProductA 객체를 생성하는 클래스
public class ConcreteCreatorA extends FactoryCreator {
    @Override
    public FactoryProduct factoryMethod() {
        return new ConcreteProductA();
    }
}