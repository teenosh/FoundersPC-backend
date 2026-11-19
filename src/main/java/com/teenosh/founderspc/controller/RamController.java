package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.Ram;
import com.teenosh.founderspc.repository.RamRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rams")
@CrossOrigin(origins = "*")
public class RamController {
    private final RamRepository ramRepository;

    public RamController(RamRepository ramRepository) {
        this.ramRepository = ramRepository;
    }

    @GetMapping
    public List<Ram> getAll() {
        return ramRepository.findBySoldSeparatelyTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ram> getCpuById(@PathVariable Long id) {
        return  ramRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
