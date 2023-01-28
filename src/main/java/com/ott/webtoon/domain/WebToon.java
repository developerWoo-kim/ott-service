package com.ott.webtoon.domain;

import com.ott.file.domain.FileMaster;
import com.ott.member.domain.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "WEBTOON_MANAGE")
@Getter @Setter
public class WebToon {
    @Id @GeneratedValue
    @Column(name = "webtoon_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;
    private String title;
    private String species;
    private String genre;
    private String code;
    private String drawingStyle;
    private String summary;
    private String story;
    @OneToOne
    @JoinColumn(name = "file_master_id")
    private FileMaster fileMaster;
    private String regNm;
    private LocalDateTime regDt;
    private String updNm;
    private LocalDateTime updDt;
}
