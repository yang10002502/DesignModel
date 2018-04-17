package observer;

/**
 * 观察者实例HexaObserver
 */
public class HexaObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getStatus() ).toUpperCase() );
    }
}
