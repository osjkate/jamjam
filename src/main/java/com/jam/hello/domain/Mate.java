package com.jam.hello.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Mate {
    @Id
    private Long id;

    @OneToOne
    private User user1;

    @OneToOne
    private User user2;
}
