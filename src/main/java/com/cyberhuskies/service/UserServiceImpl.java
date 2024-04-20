package com.cyberhuskies.service;

import com.cyberhuskies.domain.User;
import com.cyberhuskies.dao.UserDao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public User add(User user) {
        return userDao.save(user);
    }

    public List<User> getAll() {
        return userDao.findAll();
    }

    public User getById(long id) {
        return userDao.findById(id).orElse(null);
    }

    public User update(long id, User user) {
        Optional<User> userNullable = userDao.findById(id);
        if (userNullable.isEmpty()){
            throw new RuntimeException("User with ID "+id+" not found.");
        }
        User updUser = userNullable.get();
        updUser.setName(user.getName());
        updUser.setPhone(user.getPhone());
        updUser.setEmail(user.getEmail());
        updUser.setTravels(user.getTravels());
        updUser.setContactUris(user.getContactUris());
        updUser.setProfileDesc(user.getProfileDesc());
        updUser.setPhotoUrl(user.getPhotoUrl());
        // why save tho?!??!?
        return userDao.save(user);
    }

    public void deleteById(long id) {
        userDao.deleteById(id);
    }
}
