package observer;

/**
 * 观察者实例OctalObserver
 */
public class OctalObserver implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getStatus() ) );
    }
}
