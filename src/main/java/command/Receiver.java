package command;

/**
 * 命令的具体执行者
 */
public class Receiver {

    public void turnON() {
        System.out.println("执行开灯操作~");
    }
    public void turnOFF() {
        System.out.println("执行关灯操作~");
    }

}
