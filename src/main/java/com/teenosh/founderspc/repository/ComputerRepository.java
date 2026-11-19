package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
