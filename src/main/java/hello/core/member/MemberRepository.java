package hello.core.member;

public interface MemberRepository {

    void save(Member meber);

    Member findById(Long memberId);
}
