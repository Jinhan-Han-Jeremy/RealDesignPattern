package FactoryMethodProduct;

// ConcreteProductA 클래스 - Product 인터페이스의 구현체
public class ConcreteProductA implements FactoryProduct{
    @Override
    public void use() {
        System.out.println("Using Product A");
    }
}

