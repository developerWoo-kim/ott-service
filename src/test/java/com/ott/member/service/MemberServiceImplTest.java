package com.ott.member.service;

import com.ott.member.domain.Member;
import com.ott.member.domain.MemberTy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceImplTest {

    @Autowired
    private MemberServiceImpl ms;
    @Test
    void join() {
        Member member = new Member();
        member.setMemberTy(MemberTy.BASIC);
        member.setPassword("rjsdn151!");
        Long joinId = ms.join(member);

        Assertions.assertEquals(joinId, 2);
    }
}