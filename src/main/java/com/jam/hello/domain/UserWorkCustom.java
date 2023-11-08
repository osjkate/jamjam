package com.jam.hello.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
public class UserWorkCustom{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private User worker;

    @ManyToOne
    private Calendar workday;

    @Column(name = "time")
    private Time time;
}
