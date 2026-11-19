package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotherboardRepository extends JpaRepository<Motherboard, Long> {
    List<Motherboard> findBySoldSeparatelyTrue();
}
