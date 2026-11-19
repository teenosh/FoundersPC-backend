package com.teenosh.founderspc.controller;

import com.teenosh.founderspc.entity.StorageDevice;
import com.teenosh.founderspc.repository.StorageDeviceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sds")
@CrossOrigin(origins = "*")
public class StorageDeviceController {
    private final StorageDeviceRepository storageDeviceRepository;

    public StorageDeviceController(StorageDeviceRepository storageDeviceRepository) {
        this.storageDeviceRepository = storageDeviceRepository;
    }

    @GetMapping
    public List<StorageDevice> getAll() {
        return storageDeviceRepository.findBySoldSeparatelyTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StorageDevice> getCpuById(@PathVariable Long id) {
        return  storageDeviceRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
