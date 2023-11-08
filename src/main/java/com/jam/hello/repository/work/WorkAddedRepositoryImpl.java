package com.jam.hello.repository.work;

import com.jam.hello.domain.UserWork;
import com.jam.hello.domain.Work;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class WorkAddedRepositoryImpl implements WorkAddedRepository {

    private final EntityManager em;

    @Override
    public List<UserWork> findAllByUserId(Long user_id) {
        return em.createQuery("select wl from UserWork wl" +
                        "where wl.worker.id = :userId", UserWork.class)
                .setParameter("userId", user_id)
                .getResultList();

    }
}
