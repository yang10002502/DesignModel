package build;

/**
 * 商品抽象接口
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
