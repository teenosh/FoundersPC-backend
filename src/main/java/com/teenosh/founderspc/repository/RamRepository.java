package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.Ram;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RamRepository extends JpaRepository<Ram, Long> {
    List<Ram> findBySoldSeparatelyTrue();
}
