package mongoQueryDsl.dsl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mongoQueryDsl.dsl.domain.repository.MemberRepository;
import mongoQueryDsl.dsl.service.MemberService;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping(value = "/getGood")
    public void getService(@RequestParam("param") String param) {
        memberService.getPopupList(param);
    }
    
}
