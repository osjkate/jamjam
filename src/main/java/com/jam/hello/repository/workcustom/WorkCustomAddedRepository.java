package com.jam.hello.repository.workcustom;

import com.jam.hello.domain.UserWorkCustom;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface WorkCustomAddedRepository {
    List<UserWorkCustom> findAllByUserId(Long user_id);

    List<UserWorkCustom> findAllByUserIdAndDate(Long user_id, Long workday_id);
}
