import AbstractFactoryMethodProduct.*;

public class MainByAbstractFactory {
    public static void main(String[] args) {
        // ConcreteFactory1을 사용하여 관련 객체들 생성
        AbstractFactory factory1 = new ConcreteFactory1();
        Product productA1 = factory1.createProductA();
        Product productB1 = factory1.createProductB();
        productA1.use();
        productB1.use();

        // ConcreteFactory2를 사용하여 관련 객체들 생성
        AbstractFactory factory2 = new ConcreteFactory2();
        Product productA2 = factory2.createProductA();
        Product productB2 = factory2.createProductB();
        productA2.use();
        productB2.use();
    }
}
