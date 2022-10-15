package dev.dipesh.restbasics.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import dev.dipesh.restbasics.model.Livestream;

public class LiveStreamRepository {
    List<Livestream> streams = new ArrayList<>();

    public LiveStreamRepository(){
        streams.add(new Livestream(UUID.randomUUID().toString(), 
        "Harry Potter", "Wizarding World", "http://www.potterverse.com", 
        LocalDateTime.of(2022, 2, 14, 11, 0), 
        LocalDateTime.of(2022, 2, 16, 11, 0)
        ));
    }

    public List<Livestream> findAll(){
        return streams;
    }

    public Livestream findById(String id){
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse(null);
    }

    public Livestream create(Livestream stream){
        streams.add(stream);
        return stream;
    }

    public void update(Livestream stream, String id) {
        Livestream existing = streams.stream().filter(s -> s.id().equals(id)).findFirst().orElseThrow(
            ()-> new IllegalArgumentException("Stream Not found!!"));
        
            //??
        int i = streams.indexOf(existing);
        streams.set(i, stream);
        
    }

    public void delete(String id) {
        streams.removeIf(stream -> stream.id().equals(id));
        
    }

}
