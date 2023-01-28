package com.ott.file.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "FILE_MASTER_MANAGE")
@Getter @Setter
public class FileMaster {

    @Id @GeneratedValue
    @Column(name = "file_master_id")
    private Long id;
}
