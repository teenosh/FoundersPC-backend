package com.teenosh.founderspc;

import com.teenosh.founderspc.entity.Computer;
import com.teenosh.founderspc.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoundersPcApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoundersPcApplication.class, args);
    }
//
//    @Bean
//    CommandLineRunner commandLineRunner(ComputerRepository computerRepository) {
//        return args -> {
//            if (computerRepository.count() == 0) {
//                Computer computer = new Computer();
//                computer.setName("Founders Gaming Start");
//                computer.setPrice(420000);
//                computer.setCaseName("DeepCool CC560");
//                computer.setPsuWattage(650);
//
//                computerRepository.save(computer);
//            }
//        };
//    }
}
