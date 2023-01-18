// package mongoQueryDsl.dsl.config;

// import javax.persistence.EntityManager;
// import javax.persistence.EntityManagerFactory;
// import javax.persistence.PersistenceContext;
// import javax.persistence.PersistenceUnit;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;

// import com.querydsl.jpa.impl.JPAQueryFactory;

// @Configuration
// public class QueryDslConfig {

//     @PersistenceUnit
//     private EntityManager entityManager;
    
    
//     @PersistenceUnit
//     private EntityManagerFactory entityManagerFactory;

//     @Bean
//     public JPAQueryFactory jpaQueryFactory(){
//         return new JPAQueryFactory(entityManager);
//     }

//     // @Bean
//     // @Qualifier(value = "entityManager")
//     // public EntityManager entityManager(EntityManagerFactory entityManagerFactory) {
//     //     return entityManagerFactory.createEntityManager();
//     // }
// }