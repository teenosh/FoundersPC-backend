package com.teenosh.founderspc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cpus")
public class Cpu extends BaseProduct {

    @Column(length = 50)
    private String socket;

    private Integer cores;

    private Integer threads;

    @Column(name = "boost_clock_ghz")
    private Double boostClockGhz;

    public Cpu() {
    }

    public String getSocket() { return socket; }
    public void setSocket(String socket) { this.socket = socket; }

    public Integer getCores() { return cores; }
    public void setCores(Integer cores) { this.cores = cores; }

    public Integer getThreads() { return threads; }
    public void setThreads(Integer threads) { this.threads = threads; }

    public Double getBoostClockGhz() { return boostClockGhz; }
    public void setBoostClockGhz(Double boostClockGhz) { this.boostClockGhz = boostClockGhz; }
}