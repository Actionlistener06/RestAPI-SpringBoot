package dev.demirtas.streamsschedule.controller;


import dev.demirtas.streamsschedule.model.LiveStream;
import dev.demirtas.streamsschedule.repository.LiveStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;


   public LiveStreamController(LiveStreamRepository repository){
       this.repository = repository;
   }

    @GetMapping
    public List<LiveStream> findAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id){
       return repository.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@Valid @RequestBody LiveStream stream){
       return repository.create(stream);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody LiveStream stream,@PathVariable String id){
       repository.update(stream,id);

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
       repository.delete(id);

    }
}
