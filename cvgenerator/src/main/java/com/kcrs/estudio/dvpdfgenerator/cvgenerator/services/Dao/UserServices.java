package com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.Dao;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasic;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.repository.UserEntity;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements UserServicesInterface {
    @Autowired
    UserRepository userRepository;

    public void saveUser(UserBasic userBasic) {
        UserEntity userEntity = new UserEntity(userBasic);
        userRepository.save(userEntity);
    }
}
