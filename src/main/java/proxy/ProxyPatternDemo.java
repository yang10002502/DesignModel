package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_1.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像已从磁盘加载完毕
        image.display();
    }
}
