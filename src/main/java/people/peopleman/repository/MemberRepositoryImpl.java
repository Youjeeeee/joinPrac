package people.peopleman.repository;

import people.peopleman.domain.Member;

import java.util.List;

public interface MemberRepositoryImpl {

    void save(String name);
    List<Member> memberList();
}
