package hr.kreso.ucenje.dao;

import hr.kreso.ucenje.model.Member;

import java.util.List;
import java.util.Map;

public interface MemberDao {

    List<Member> fetchMemberByCriteria(Map<String, Object> params);

    int countMemberByCriteria(Map<String, Object> params);
}
