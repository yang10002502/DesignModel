package strategy;

public class Context {

    private Integer vendorModel;   //设备类型
    private String groupName;      //商品名字

    public Context(Integer vendorModel, String groupName) {
        this.vendorModel = vendorModel;
        this.groupName = groupName;
    }

    public Integer getVendorModel() {
        return vendorModel;
    }

    public void setVendorModel(Integer vendorModel) {
        this.vendorModel = vendorModel;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
