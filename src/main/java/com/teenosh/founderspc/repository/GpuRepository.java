package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.Computer;
import com.teenosh.founderspc.entity.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GpuRepository extends JpaRepository<Gpu, Long> {
    List<Gpu> findBySoldSeparatelyTrue();
}
