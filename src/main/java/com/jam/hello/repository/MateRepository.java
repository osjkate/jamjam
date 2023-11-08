package com.jam.hello.repository;

import com.jam.hello.domain.Mate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateRepository extends JpaRepository<Mate, Long> {
}
