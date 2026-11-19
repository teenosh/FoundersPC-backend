package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.Motherboard;
import com.teenosh.founderspc.repository.MotherboardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mbs")
@CrossOrigin(origins = "*")
public class MotherboardController {
    private final MotherboardRepository motherboardRepository;

    public MotherboardController(MotherboardRepository motherboardRepository) {
        this.motherboardRepository = motherboardRepository;
    }

    @GetMapping
    public List<Motherboard> getAll() {
        return motherboardRepository.findBySoldSeparatelyTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motherboard> getCpuById(@PathVariable Long id) {
        return  motherboardRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
