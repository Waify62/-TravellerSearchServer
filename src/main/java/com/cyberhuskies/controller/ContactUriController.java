package com.cyberhuskies.controller;

import com.cyberhuskies.domain.ContactUri;
import com.cyberhuskies.service.ContactUriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ContactUriController {
    private final ContactUriService contactUriService;

    @PostMapping("/contactUri")
    public ContactUri add(@RequestBody ContactUri contactUri){
        return contactUriService.add(contactUri);
    }

    @GetMapping("/contactUri")
    public List<ContactUri> getAll(){
        return contactUriService.getAll();
    }

    @GetMapping("/contactUri/{id}")
    public ContactUri getById(@PathVariable long id){
        return contactUriService.getById(id);
    }

    @PutMapping("/contactUri/{id}")
    public ContactUri update(@PathVariable long id,
                       @RequestBody ContactUri contactUri){
        return contactUriService.update(id, contactUri);
    }

    @DeleteMapping("/contactUri/{id}")
    public void deleteById(@PathVariable long id) {
        contactUriService.deleteById(id);
    }
}
