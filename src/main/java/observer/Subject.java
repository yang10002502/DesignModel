package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，定义List列表存储观察者，当状态改变，遍历通知已注册的观察者
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private Integer status;

    public void changeStatus(Integer s){
        status = s;
        this.noticeAllObservers();
    }

    /**
     * 遍历通知所有登记的观察者
     */
    public void noticeAllObservers(){
        observers.stream().forEach(observer -> {
            observer.update(this);
        });
    }

    /**
     * 观察者登记注册
     * @param observer
     */
    public void register(Observer observer){
        this.observers.add(observer);
    }

    /**
     * 观察者注销登记注册
     * @param observer
     */
    public void remover(Observer observer){
        this.observers.remove(observer);
    }

    public Subject(Integer status) {
        this.status = status;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
