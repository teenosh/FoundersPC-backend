package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "storage_devices")
public class StorageDevice extends BaseProduct {

    @Column(name = "capacity_gb", nullable = false)
    private Integer capacityGb;

    @Column(name = "storage_type", length = 30, nullable = false)
    private String storageType;

    public StorageDevice() {
    }

    public Integer getCapacityGb() { return capacityGb; }
    public void setCapacityGb(Integer capacityGb) { this.capacityGb = capacityGb; }

    public String getStorageType() { return storageType; }
    public void setStorageType(String storageType) { this.storageType = storageType; }
}