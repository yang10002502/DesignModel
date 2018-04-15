package iteration;

import java.math.BigDecimal;

public class HandlerContext {
    private BigDecimal free;     //剩余
    private BigDecimal cost;     //花费
    private BigDecimal budget;   //预算
    private String detail;       //明细

    public BigDecimal getFree() {
        return free;
    }

    public void setFree(BigDecimal free) {
        this.free = free;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "HandlerContext{" +
                "free=" + free +
                ", cost=" + cost +
                ", budget=" + budget +
                ", detail='" + detail + '\'' +
                '}';
    }
}
