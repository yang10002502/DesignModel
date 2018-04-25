package observer;

import org.junit.jupiter.api.Test;

/**
 * 观察者模式测试用例
 */
public class ObserverTest {

    @Test
    public void registerTest(){

        Subject subject = new Subject(4);
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        HexaObserver hexaObserver = new HexaObserver();
        subject.register(binaryObserver);
        subject.register(octalObserver);
        subject.register(hexaObserver);

        subject.changeStatus(8);
    }

    @Test
    public void removeTest(){

        Subject subject = new Subject(4);
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();
        HexaObserver hexaObserver = new HexaObserver();
        subject.register(binaryObserver);
        subject.register(octalObserver);
        subject.register(hexaObserver);
        subject.changeStatus(8);

        subject.remover(octalObserver);
        System.out.println("after remove octalObserver ....");
        subject.changeStatus(4);

    }

}
