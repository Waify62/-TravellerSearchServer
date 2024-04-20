package com.cyberhuskies.controller;

import com.cyberhuskies.domain.Travel;
import com.cyberhuskies.service.TravelService;
import com.cyberhuskies.service.TravelServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TravelController {
    private final TravelService travelService;

    @PostMapping("/travel")
    public Travel add(@RequestBody Travel travel){
        return travelService.add(travel);
    }

    @GetMapping("/travel")
    public List<Travel> getAll(){
        return travelService.getAll();
    }

    @GetMapping("/travel/{id}")
    public Travel getById(@PathVariable long id){
        return travelService.getById(id);
    }

    @PutMapping("/travel/{id}")
    public Travel update(@PathVariable long id,
                       @RequestBody Travel travel){
        return travelService.update(id, travel);
    }

    @DeleteMapping("/travel/{id}")
    public void deleteById(@PathVariable long id) {
        travelService.deleteById(id);
    }
}
