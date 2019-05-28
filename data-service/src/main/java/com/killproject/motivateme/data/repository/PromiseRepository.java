package com.killproject.motivateme.data.repository;

import com.killproject.motivateme.data.dto.Promise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromiseRepository extends JpaRepository<Promise, Long> {
}
