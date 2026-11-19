package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "motherboards")
public class Motherboard extends BaseProduct {

    @Column(length = 50, nullable = false)
    private String socket;

    @Column(length = 50, nullable = false)
    private String chipset;

    @Column(name = "ram_type", length = 20, nullable = false)
    private String ramType;

    @Column(name = "form_factor", length = 20)
    private String formFactor;

    public Motherboard() {
    }

    public String getSocket() { return socket; }
    public void setSocket(String socket) { this.socket = socket; }

    public String getChipset() { return chipset; }
    public void setChipset(String chipset) { this.chipset = chipset; }

    public String getRamType() { return ramType; }
    public void setRamType(String ramType) { this.ramType = ramType; }

    public String getFormFactor() { return formFactor; }
    public void setFormFactor(String formFactor) { this.formFactor = formFactor; }
}