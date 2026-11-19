package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gpus")
public class Gpu extends BaseProduct {

    @Column(name = "vram_gb", nullable = false)
    private Integer vramGb;

    @Column(name = "memory_type", length = 20)
    private String memoryType;

    public Gpu() {
    }

    public Integer getVramGb() { return vramGb; }
    public void setVramGb(Integer vramGb) { this.vramGb = vramGb; }

    public String getMemoryType() { return memoryType; }
    public void setMemoryType(String memoryType) { this.memoryType = memoryType; }
}