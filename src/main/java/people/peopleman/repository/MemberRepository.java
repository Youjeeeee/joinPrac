package people.peopleman.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import people.peopleman.domain.Member;

import java.util.*;


public class MemberRepository implements MemberRepositoryImpl {

    private static final Logger log = LoggerFactory.getLogger(MemberRepository.class);
    public static Map<Long, Member> memberRepository = new HashMap<>();
    public static Long seq = 0L;

    @Override
    public void save(String name) {

        Member member = new Member();
        member.setId(++seq);
        member.setName(name);

        log.info(member.getName());
        log.info(member.getId().toString());

        memberRepository.put(seq, member);

    }

    @Override
    public List<Member> memberList() {

        List<Member> memberList = new ArrayList<>(memberRepository.values());

        return memberList;
    }
}
