package build;

import org.junit.jupiter.api.Test;

public class StringBuildTest {

    @Test
    public void test() {
        StringBuilder stringBuilder = new StringBuilder("hello world");
        StringBuilder appendString = stringBuilder.append(" !");

        System.out.println("appendString == stringBuilder :" + appendString.equals(stringBuilder));

        String string = stringBuilder.toString();
        System.out.println(string);

    }
}
