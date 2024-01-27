package com.example.todaylook;

import com.example.todaylook.service.TimeService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class TodayLookApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodayLookApplication.class, args);
    }
}
