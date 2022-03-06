package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.MemberStatus;

import java.util.List;
import java.util.Map;

public interface MemberStatusDao {

    List<MemberStatus> fetchMemberStatusByCriteria(Map<String, Object> params);

    int countMemberStatusByCriteria(Map<String, Object> params);
}
