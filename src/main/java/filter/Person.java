package filter;

public class Person {
    private String name;
    private Integer gender;           //0：女性，1：男性
    private Integer maritalStatus;    //0：未婚，1：已婚

    public Person(String name, Integer gender, Integer maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + SexConstant.getName(gender) +
                ", maritalStatus=" + MarriageConstant.getName(maritalStatus) +
                '}';
    }
}
