package mongoQueryDsl.dsl.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mongoQueryDsl.dsl.domain.entity.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, String>
, QuerydslPredicateExecutor<Member>, MemberRepositoryDsl {
    
    Optional<Member> findByName();
}
