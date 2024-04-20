package com.cyberhuskies.dao;

import com.cyberhuskies.domain.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelDao extends JpaRepository<Travel, Long> {
}
