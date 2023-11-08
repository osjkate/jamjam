package com.jam.hello.repository.workcustom;

import com.jam.hello.domain.UserWorkCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCustomRepository extends JpaRepository<UserWorkCustom, Long>, WorkCustomAddedRepository {

}
