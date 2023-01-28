package com.ott.member.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER_MANAGE")
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String password;
    @Enumerated(EnumType.STRING)
    private MemberTy memberTy;

}
