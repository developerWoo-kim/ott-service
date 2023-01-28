package com.ott.todo.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Todo {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean completed = false;
    @Column(nullable = false)
    private String todoName;
}
