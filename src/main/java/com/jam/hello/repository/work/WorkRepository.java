package com.jam.hello.repository.work;

import com.jam.hello.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkRepository extends JpaRepository<Work, Long>, WorkAddedRepository{
}
