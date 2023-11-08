package com.jam.hello.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Work {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String name;

    @Column(name = "location")
    private Location location;
}
