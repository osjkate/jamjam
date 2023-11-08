package com.jam.hello.repository.workcustom;

import com.jam.hello.domain.UserWorkCustom;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class WorkCustomAddedRepositoryImpl implements WorkCustomAddedRepository{

    private final EntityManager em;

    public List<UserWorkCustom> findAllByUserId(Long user_id) {
        return em.createQuery("select wl from UserWorkCustom wl" +
                        "where wl.worker.id = :userId", UserWorkCustom.class)
                .setParameter("userId", user_id)
                .getResultList();
    }

    @Override
    public List<UserWorkCustom> findAllByUserIdAndDate(Long user_id, Long workday_id) {
        return em.createQuery("select wl from UserWorkCustom wl" +
                        "where wl.worker.id = :user_id and wl.workday_id = :workday_id", UserWorkCustom.class)
                .setParameter("user_id", user_id)
                .setParameter("workday_id", workday_id)
                .getResultList();

    }


}
