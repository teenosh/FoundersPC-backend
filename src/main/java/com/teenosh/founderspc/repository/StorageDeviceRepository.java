package com.teenosh.founderspc.repository;

import com.teenosh.founderspc.entity.StorageDevice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StorageDeviceRepository extends JpaRepository<StorageDevice, Long> {
    List<StorageDevice> findBySoldSeparatelyTrue();
}
