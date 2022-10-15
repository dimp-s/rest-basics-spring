package dev.dipesh.restbasics.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.dipesh.restbasics.model.Livestream;
import dev.dipesh.restbasics.repository.LiveStreamRepository;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {
    //dependency injection
    private final LiveStreamRepository liveStreamRepository;
    


    public LiveStreamController(LiveStreamRepository liveStreamRepository) {
        this.liveStreamRepository = liveStreamRepository;
    }



    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Livestream> findAll(){
        return liveStreamRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livestream findById(@PathVariable String id){
       return liveStreamRepository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    //request body annotation to affirm a vody with a request
    public Livestream createStream(@RequestBody Livestream stream){
        return liveStreamRepository.create(stream);
    }
}
