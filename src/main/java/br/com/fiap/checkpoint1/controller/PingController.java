package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

    @Value("${ping.message}")
    private String pingMessage;

    @GetMapping("/Ping")
    public String dev() {
        return pingMessage;
    }

}