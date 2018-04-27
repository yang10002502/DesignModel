package template;

/**
 * 具体的游戏，实现Game定义的抽象方法
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Gare initialize....");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket start play....");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket end play....");
    }
}
