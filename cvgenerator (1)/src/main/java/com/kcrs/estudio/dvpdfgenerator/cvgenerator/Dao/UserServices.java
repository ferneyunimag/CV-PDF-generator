package com.kcrs.estudio.dvpdfgenerator.cvgenerator.Dao;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasicBuilderInterface;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.controller.UserNotFoundException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.repository.UserEntity;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasic;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserServices implements UserServicesInterface {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserBasicBuilderInterface userBasicBuilder;

    public void saveUser(UserBasic userBasic) {
        UserEntity userEntity = new UserEntity(userBasic);
        userRepository.save(userEntity);
    }

    @Override
    public List<UserBasic> getAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        if (users.isEmpty()) {
            throw new UserNotFoundException("CR002", "there are no registered users yet", "", ZonedDateTime.now());
        }
        List<UserBasic> usersBasic = new ArrayList<>();
        for (UserEntity u : users) {
            usersBasic.add(userBasicBuilder(u));
        }
        return usersBasic;
    }

    public UserBasic getUser(String id) {
        Optional optional = userRepository.findById(id);
        if (!(optional.isPresent())) {
            throw new UserNotFoundException("CR001", "User no registered on DB", "", ZonedDateTime.now());
        }
        UserEntity userEntity = (UserEntity) optional.get();
        return userBasicBuilder(userEntity);
    }


    private UserBasic userBasicBuilder(UserEntity userEntity) {
        return userBasicBuilder.
                withId(userEntity.getId()).
                withName(userEntity.getName()).
                withEmail(userEntity.getEmail()).
                withPhone(userEntity.getPhone()).
                build();
    }


}
