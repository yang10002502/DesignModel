package observer;

/**
 * 观察者实例BinaryObserver
 */
public class BinaryObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getStatus() ) );
    }
}
