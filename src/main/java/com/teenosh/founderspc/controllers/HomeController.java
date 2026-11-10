package com.teenosh.founderspc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/store")
    public List<String> store() {
        return List.of("PCs", "GPUs", "CPU & MB", "Memory");
    }

    @GetMapping("/store/pcs")
    public List<String> storePCs() {
        return List.of("PC1", "PC2", "PC3", "PC4");
    }

    @GetMapping("/store/gpus")
    public List<String> storeGPUs() {
        return List.of("GPU1", "GPU2", "GPU3", "GPU4");
    }

    @GetMapping("/store/cpuandmb")
    public List<String> storeCPUandMB() {
        return List.of("CPU1", "CPU2", "MB1", "MB2");
    }

    @GetMapping("/store/mem")
    public List<String> storeMem() {
        return List.of("HDD1", "SSD1", "RAM1", "RAM2");
    }

    @GetMapping("/contact")
    public List<String> contact() {
        return List.of("@telegram", "+whatsapp", "@email");
    }
}
