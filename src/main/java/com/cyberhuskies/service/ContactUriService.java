package com.cyberhuskies.service;

import com.cyberhuskies.domain.ContactUri;

import java.util.List;

public interface ContactUriService {
    ContactUri add(ContactUri contactInfoUrl);

    List<ContactUri> getAll();

    ContactUri getById(long id);

    ContactUri update(long id, ContactUri contactInfoUrl);

    void deleteById(long id);
}
