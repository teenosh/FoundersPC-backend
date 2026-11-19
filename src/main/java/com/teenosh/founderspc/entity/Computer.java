package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "computers")
public class Computer extends BaseProduct {

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "cpu_id", nullable = false)
    private Cpu cpu;

    @ManyToOne
    @JoinColumn(name = "gpu_id")
    private Gpu gpu;

    @ManyToOne
    @JoinColumn(name = "motherboard_id", nullable = false)
    private Motherboard motherboard;

    @ManyToOne
    @JoinColumn(name = "ram_id", nullable = false)
    private Ram ram;

    @ManyToOne
    @JoinColumn(name = "storage_id", nullable = false)
    private StorageDevice storage;

    @Column(name = "psu_wattage", nullable = false)
    private Integer psuWattage;

    @Column(name = "case_name", length = 100, nullable = false)
    private String caseName;

    public Computer() {
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Cpu getCpu() { return cpu; }
    public void setCpu(Cpu cpu) { this.cpu = cpu; }

    public Gpu getGpu() { return gpu; }
    public void setGpu(Gpu gpu) { this.gpu = gpu; }

    public Motherboard getMotherboard() { return motherboard; }
    public void setMotherboard(Motherboard motherboard) { this.motherboard = motherboard; }

    public Ram getRam() { return ram; }
    public void setRam(Ram ram) { this.ram = ram; }

    public StorageDevice getStorage() { return storage; }
    public void setStorage(StorageDevice storage) { this.storage = storage; }

    public Integer getPsuWattage() { return psuWattage; }
    public void setPsuWattage(Integer psuWattage) { this.psuWattage = psuWattage; }

    public String getCaseName() { return caseName; }
    public void setCaseName(String caseName) { this.caseName = caseName; }
}