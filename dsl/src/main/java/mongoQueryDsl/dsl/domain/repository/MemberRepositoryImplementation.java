package mongoQueryDsl.dsl.domain.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mongoQueryDsl.dsl.domain.entity.Member;

public class MemberRepositoryImplementation implements MemberRepositoryDsl {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public Member findByName(String name) {
        return (Member) entityManager.createQuery("FROM Member u WHERE u.name = :name")
        .setParameter("name", name)
        .getSingleResult();
        
    }
    
}
