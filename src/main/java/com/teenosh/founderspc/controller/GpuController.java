package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.Gpu;
import com.teenosh.founderspc.repository.GpuRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gpus")
@CrossOrigin(origins = "*")
public class GpuController {
    private final GpuRepository gpuRepository;

    public GpuController(GpuRepository gpuRepository) {
        this.gpuRepository = gpuRepository;
    }

    @GetMapping
    public List<Gpu> getAll() {
        return gpuRepository.findBySoldSeparatelyTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gpu> getCpuById(@PathVariable Long id) {
        return  gpuRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
