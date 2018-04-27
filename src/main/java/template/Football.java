package template;

/**
 * 具体的游戏，实现Game定义的抽象方法
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football initialize start....");
    }

    @Override
    void startPlay() {
        System.out.println("Football start play....");
    }

    @Override
    void endPlay() {
        System.out.println("Football end play....");
    }
}
