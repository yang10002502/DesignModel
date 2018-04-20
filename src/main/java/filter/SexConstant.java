package filter;

public enum SexConstant {

    FEMALE("女性", 0),
    MALE("男性", 1),;

    private String name;
    private Integer index;

    SexConstant(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public static String getName(Integer index) {
        for (SexConstant item : SexConstant.values()) {
            if (item.getIndex().equals(index)) {
                return item.getName();
            }
        }
        return null;
    }
}
