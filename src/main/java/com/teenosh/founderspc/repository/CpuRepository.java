package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CpuRepository extends JpaRepository<Cpu, Long> {
    List<Cpu> findBySoldSeparatelyTrue();
}
