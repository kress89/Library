package hr.kreso.ucenje.model;

import java.io.Serializable;
import java.util.Date;

public class FinePayment implements Serializable {

    private static final long serialVersionUID = 1L;

    private long finePaymentId;
    private Integer memberId;
    private Date    paymentDate;
    private Integer paymentAmount;

    public long getFinePaymentId() {
        return finePaymentId;
    }

    public void setFinePaymentId(long finePaymentId) {
        this.finePaymentId = finePaymentId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "FinePayment{" +
                "finePaymentId=" + finePaymentId +
                ", memberId=" + memberId +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
