package com.jam.hello.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter
@Entity
public class Calendar {

    @Id
    @GeneratedValue
    private Long id;

    private Date date;

    @OneToMany(mappedBy = "workday")
    private List<UserWork> workList;

    @OneToMany(mappedBy = "workday")
    private List<UserWorkCustom> workCustomList;
}
