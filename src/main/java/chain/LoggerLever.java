package chain;

/**
 * 日志等级
 */
public enum LoggerLever {
    INFO("info",1),
    WARNING("warning",2),
    ERROR("error",3),
    DEFAULT("default",4),
    ;

    LoggerLever(String name, Integer index) {
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

    public static String getLeverName(Integer index){
        for(LoggerLever lever : LoggerLever.values()){
            if(lever.getIndex().equals(index)){
                return lever.getName();
            }
        }
        return null;
    }

    public static Integer getLeverIndex(String name){
        for(LoggerLever lever : LoggerLever.values()){
            if(lever.getName().equals(name)){
                return lever.getIndex();
            }
        }
        return null;
    }

    public static LoggerLever getLoggerLever(String name){
        for(LoggerLever lever : LoggerLever.values()){
            if(lever.getName().equals(name)){
                return lever;
            }
        }
        return null;
    }

    public static LoggerLever getLoggerLever(Integer index){
        for(LoggerLever lever : LoggerLever.values()){
            if(lever.getIndex().equals(index)){
                return lever;
            }
        }
        return null;
    }

}
