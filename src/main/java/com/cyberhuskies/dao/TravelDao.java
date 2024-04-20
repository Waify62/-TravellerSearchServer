package com.cyberhuskies.dao;

import com.cyberhuskies.domain.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelDao extends JpaRepository<Travel, Long> {

}
