package FactoryMethodProduct;

// Creator 추상 클래스 - 팩토리 메서드를 정의하는 클래스
public abstract class FactoryCreator {
    // 팩토리 메서드 - 구체적인 객체 생성을 위한 추상 메서드
    public abstract FactoryProduct factoryMethod();

    // 클라이언트 메서드 - 팩토리 메서드를 사용하여 객체를 생성하고 사용하는 메서드
    public void doSomething() {
        FactoryProduct product = factoryMethod();
        product.use();
    }
}