package FactoryMethodProduct;

// ConcreteCreatorB 클래스 - Creator 클래스를 확장하여 ProductB 객체를 생성하는 클래스
public class ConcreteCreatorB extends FactoryCreator {
    @Override
    public FactoryProduct factoryMethod() {
        return new ConcreteProductB();
    }
}