package hr.kreso.ucenje.model;

import java.io.Serializable;

public class MemberStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private long memberStatusId;
    private String statusValue;

    public long getMemberStatusId() {
        return memberStatusId;
    }

    public void setMemberStatusId(long memberStatusId) {
        this.memberStatusId = memberStatusId;
    }

    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    @Override
    public String toString() {
        return "MemberStatus{" +
                "memberStatusId=" + memberStatusId +
                ", statusValue='" + statusValue + '\'' +
                '}';
    }
}
