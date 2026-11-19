package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.Computer;
import com.teenosh.founderspc.repository.ComputerRepository;
import com.teenosh.founderspc.repository.RamRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pcs")
@CrossOrigin(origins = "*")
public class ComputerController {
    private final ComputerRepository computerRepository;

    public ComputerController(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @GetMapping
    public List<Computer> getAllPcs() {
        return computerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Computer> getPcById(@PathVariable Long id) {
        return computerRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Computer createComputer(@RequestBody Computer computer) {
        return computerRepository.save(computer);
    }
}
