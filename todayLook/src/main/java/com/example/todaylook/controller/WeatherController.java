package com.example.todaylook.controller;

import com.example.todaylook.service.WeatherService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService service;
    @GetMapping
    public String weatherResult() throws IOException, ParseException {
        service.ApiExplorer();
        return "done";
    }
}
