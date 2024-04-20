package com.cyberhuskies.service;

import com.cyberhuskies.dao.ContactUriDao;
import com.cyberhuskies.dao.ContactUriDao;
import com.cyberhuskies.domain.ContactUri;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ContactUriServiceImpl implements ContactUriService{
    private ContactUriDao contactUriDao;

    public ContactUri add(ContactUri ContactUri) {
        return contactUriDao.save(ContactUri);
    }

    public List<ContactUri> getAll() {
        return contactUriDao.findAll();
    }

    public ContactUri getById(long id) {
        return contactUriDao.findById(id).orElse(null);
    }

    public ContactUri update(long id, ContactUri ContactUri) {
        Optional<ContactUri> contactUriNullable = contactUriDao.findById(id);
        if (contactUriNullable.isEmpty()){
            throw new RuntimeException("ContactUri with ID "+id+" not found.");
        }
        ContactUri updContactUri = contactUriNullable.get();
        updContactUri.setSocialMediaURI(ContactUri.getSocialMediaURI());
        updContactUri.setSocialMediaName(ContactUri.getSocialMediaName());
        updContactUri.setUser(ContactUri.getUser());

        return contactUriDao.save(ContactUri);
    }

    public void deleteById(long id) {
        contactUriDao.deleteById(id);
    }
}
