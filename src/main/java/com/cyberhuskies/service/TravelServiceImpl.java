package com.cyberhuskies.service;

import com.cyberhuskies.dao.TravelDao;
import com.cyberhuskies.domain.Travel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService{
    private TravelDao travelDao;
    
    
    public Travel add(Travel Travel) {
        return travelDao.save(Travel);
    }

    public List<Travel> getAll() {
        return travelDao.findAll();
    }

    public Travel getById(long id) {
        return travelDao.findById(id).orElse(null);
    }

    public Travel update(long id, Travel Travel) {
        Optional<Travel> travelNullable = travelDao.findById(id);
        if (travelNullable.isEmpty()){
            throw new RuntimeException("Travel with ID "+id+" not found.");
        }
        Travel updTravel = travelNullable.get();
        updTravel.setCity(Travel.getCity());
        updTravel.setCoordinates(Travel.getCoordinates());
        updTravel.setUsers(Travel.getUsers());
        updTravel.setStartDate(Travel.getStartDate());
        updTravel.setFinishDate(Travel.getFinishDate());
        return travelDao.save(Travel);
    }

    public void deleteById(long id) {
        travelDao.deleteById(id);
    }
    
}
