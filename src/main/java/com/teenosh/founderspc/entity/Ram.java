package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rams")
public class Ram extends BaseProduct {

    @Column(name = "capacity_gb", nullable = false)
    private Integer capacityGb;

    @Column(name = "ram_type", length = 20, nullable = false)
    private String ramType;

    @Column(name = "frequency_mhz")
    private Integer frequencyMhz;

    public Ram() {
    }

    public Integer getCapacityGb() { return capacityGb; }
    public void setCapacityGb(Integer capacityGb) { this.capacityGb = capacityGb; }

    public String getRamType() { return ramType; }
    public void setRamType(String ramType) { this.ramType = ramType; }

    public Integer getFrequencyMhz() { return frequencyMhz; }
    public void setFrequencyMhz(Integer frequencyMhz) { this.frequencyMhz = frequencyMhz; }
}