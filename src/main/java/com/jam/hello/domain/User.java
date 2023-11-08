package com.jam.hello.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {

    @Id
    @Column
    @GeneratedValue
    private Long id;

    private String password;
    private String username;

    @OneToMany(mappedBy = "worker")
    private List<UserWork> workLists = new ArrayList<>();

    @OneToMany(mappedBy = "worker")
    private List<UserWorkCustom> workListsCustom = new ArrayList<>();

    @OneToOne
    private Mate mate;

    private int salary;

    private boolean child_plan;

    private int commute_time;

    @Column(name = "preferred_time")
    private Time preferred_time;

    @Builder
    public User(Long id, String username, String password, List<UserWork> userWorks, List<UserWorkCustom> userWorkCustoms
            , int salary, boolean child_plan, int commute_time, Time preferred_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.workLists = userWorks;
        this.workListsCustom = userWorkCustoms;
        this.salary = salary;
        this.child_plan = child_plan;
        this.commute_time = commute_time;
        this.preferred_time = preferred_time;
    }


}
