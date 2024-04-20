package com.cyberhuskies.service;

import com.cyberhuskies.domain.Travel;

import java.util.List;

public interface TravelService {
    Travel add(Travel travel);

    List<Travel> getAll();

    Travel getById(long id);

    Travel update(long id, Travel travel);

    void deleteById(long id);
}
