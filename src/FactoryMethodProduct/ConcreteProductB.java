package FactoryMethodProduct;

// ConcreteProductB 클래스 - Product 인터페이스의 또 다른 구현체
public class ConcreteProductB implements FactoryProduct {
    @Override
    public void use() {
        System.out.println("Using Product B");
    }
}
