package dev.dipesh.restbasics.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dipesh.restbasics.model.Livestream;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Livestream> findAll(){
        return null;
    }
}
