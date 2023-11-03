package com.jam.hello.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Long id;

    private String password;
    private String username;

    @OneToMany(mappedBy = "user")
    private List<UserWork> workLists = new ArrayList<>();

    @OneToOne
    private User mate;
}
