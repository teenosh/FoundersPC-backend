package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.Cpu;
import com.teenosh.founderspc.repository.CpuRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cpus")
@CrossOrigin(origins = "*")
public class CpuController {
    private final CpuRepository cpuRepository;

    public CpuController(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }

    @GetMapping
    public List<Cpu> getAll() {
        return cpuRepository.findBySoldSeparatelyTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cpu> getCpuById(@PathVariable Long id) {
        return  cpuRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
