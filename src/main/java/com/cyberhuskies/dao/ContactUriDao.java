package com.cyberhuskies.dao;

import com.cyberhuskies.domain.ContactUri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUriDao extends JpaRepository<ContactUri, Long> {

}
