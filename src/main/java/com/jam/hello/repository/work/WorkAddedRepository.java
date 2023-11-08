package com.jam.hello.repository.work;

import com.jam.hello.domain.UserWork;
import com.jam.hello.domain.Work;

import java.util.List;
import java.util.Optional;

public interface WorkAddedRepository {
    List<UserWork> findAllByUserId(Long user_id);
}
