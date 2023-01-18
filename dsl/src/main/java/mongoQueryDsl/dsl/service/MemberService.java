package mongoQueryDsl.dsl.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import mongoQueryDsl.dsl.domain.repository.MemberRepositoryImplementation;

@Service
@RequiredArgsConstructor
public class MemberService {
        
    //private final MemberRepository memberRepository;
    private  MemberRepositoryImplementation memberRepositoryImplementation;
    public Object getPopupList;

    // Show 3개 나오게 하기
    @Transactional(readOnly = true)
    public void getPopupList(String name) {

        var a = memberRepositoryImplementation.findByName(name);

        System.out.println(a);
    }

    
}
