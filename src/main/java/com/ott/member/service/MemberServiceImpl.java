package com.ott.member.service;

import com.ott.member.domain.Member;
import com.ott.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl {
    @Autowired
    private MemberRepository mr;

    /**
     * 회원 등록
     *
     * @param member
     * @return
     */
    public Long join(Member member) {
        Member save = mr.save(member);
        return save.getId();
    }
}
