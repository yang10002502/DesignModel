package template;

/**
 *  测试类
 */
public class TemplatePatternTest {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
