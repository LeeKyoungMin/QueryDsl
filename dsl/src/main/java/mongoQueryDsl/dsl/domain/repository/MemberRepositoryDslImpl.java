// package mongoQueryDsl.dsl.domain.repository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.mongodb.core.MongoOperations;
// import org.springframework.data.mongodb.repository.support.QuerydslRepositorySupport;

// import lombok.RequiredArgsConstructor;
// import mongoQueryDsl.dsl.domain.entity.Member;
// import mongoQueryDsl.dsl.domain.entity.QMember;


// public class MemberRepositoryDslImpl extends QuerydslRepositorySupport implements MemberRepositoryDsl{

//     private static final QMember qmember = QMember.member;

//     public MemberRepositoryDslImpl(MongoOperations operations) {
//         super(operations);
//         //TODO Auto-generated constructor stub
//     }

//     @Override
//     public Member findByName(String name) {
  
//       return from(qmember).where(qmember.name.eq(name)).fetchOne();
//     }
    
//     // @Autowired
//     // private MongoOperations mongoOperations; //이건 뭐냐
    
//     // @Override
//     // public void subtractFromAccount(String, bankAccountId, int amount) {
    	
//     //     BankAccountDetails bankAccountDetails =
//     //     	mongoOperations.findById(bankAccountId, BankAccountDetails.class);
            
// 	// 	if(bankAccountDetails.getBalance() < amount) {
//     //     	throw new RuntimException("Insufficient balance amount in bank account");
//     //     }
//     //     bankAccountDetails.setBalance(bankAccountDetails.getBalance() - amount);
//     //     mongoOperations.save(bankAccountDetails);
//     // }

    
// }
