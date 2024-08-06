import FactoryMethodProduct.FactoryCreator;
import FactoryMethodProduct.ConcreteCreatorA;
import FactoryMethodProduct.ConcreteCreatorB;

public class MainByFactory {

    public static void main(String[] args) {


        FactoryCreator creatorA = new ConcreteCreatorA();
        creatorA.doSomething();


        // ConcreteCreatorB를 사용하여 ProductB 객체 생성
        FactoryCreator creatorB = new ConcreteCreatorB();
        creatorB.doSomething();
    }
}
