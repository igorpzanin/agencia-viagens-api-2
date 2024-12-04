package com.travelagency.controller;

import com.travelagency.entity.Destination;
import com.travelagency.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping
    public List<Destination> getAll() {
        return destinationService.findAll();
    }

    @PostMapping
    public Destination create(@RequestBody Destination destination) {
        return destinationService.save(destination);
    }
}
