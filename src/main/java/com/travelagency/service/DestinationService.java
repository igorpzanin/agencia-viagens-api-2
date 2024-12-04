package com.travelagency.service;

import com.travelagency.entity.Destination;
import com.travelagency.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    @Autowired
    private DestinationRepository destinationRepository;

    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    public Destination save(Destination destination) {
        return destinationRepository.save(destination);
    }
}
