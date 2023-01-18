package mongoQueryDsl.dsl.domain.repository;

import mongoQueryDsl.dsl.domain.entity.Member;

public interface MemberRepositoryDsl {

    Member findByName(String name);
    
}