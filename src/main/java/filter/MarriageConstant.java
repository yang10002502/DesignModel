package filter;

public enum MarriageConstant {

    SINGLE("未婚", 0),
    MARRIED("已婚", 1),;

    MarriageConstant(String name, Integer index) {
        this.index = index;
        this.name = name;
    }

    private Integer index;
    private String name;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName(Integer index) {
        for (MarriageConstant item : MarriageConstant.values()) {
            if (item.getIndex().equals(index)) {
                return item.getName();
            }
        }
        return null;
    }
}
