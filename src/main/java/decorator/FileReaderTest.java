package decorator;

import org.junit.jupiter.api.Test;

import java.io.*;


/**
 * jdk中的输入输出流就是装饰者模式
 */
public class FileReaderTest {

    @Test
    public void test() throws Exception {

        String path = "/Users/yangxinlei/test.log";
        Reader reader = new FileReader(new File(path));
        BufferedReader bfr = new BufferedReader(reader); //创建缓冲流
        char[] ch = new char[100];
        int i;
        while ((i = bfr.read(ch)) > 0) {
            System.out.println(String.valueOf(ch, 0, i));
        }
    }
}
