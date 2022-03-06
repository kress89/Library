package hr.kreso.ucenje.model;

import java.io.Serializable;
import java.util.Date;

public class Fine implements Serializable {

    private static final long serialVersionUID = 1L;

    private long     fineId;
    private Integer  memberId;
    private Integer  loanId;
    private Date     fineDate;
    private Integer  fineAmount;


    public long getFineId() {
        return fineId;
    }

    public void setFineId(long fineId) {
        this.fineId = fineId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Date getFineDate() {
        return fineDate;
    }

    public void setFineDate(Date fineDate) {
        this.fineDate = fineDate;
    }

    public Integer getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(Integer fineAmount) {
        this.fineAmount = fineAmount;
    }

    @Override
    public String toString() {
        return "Fine{" +
                "fineId=" + fineId +
                ", memberId=" + memberId +
                ", loanId=" + loanId +
                ", fineDate=" + fineDate +
                ", fineAmount=" + fineAmount +
                '}';
    }
}
