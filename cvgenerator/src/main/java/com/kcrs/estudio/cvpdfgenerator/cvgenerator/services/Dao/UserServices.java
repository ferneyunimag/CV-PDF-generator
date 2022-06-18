package com.kcrs.estudio.cvpdfgenerator.cvgenerator.services.Dao;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.controller.UserNotFoundException;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.repository.UserEntity;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.user.UserBasic;
import com.kcrs.estudio.cvpdfgenerator.cvgenerator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Optional;

@Service
public class UserServices implements UserServicesInterface {
    @Autowired
    UserRepository userRepository;

    public void saveUser(UserBasic userBasic) {
        UserEntity userEntity = new UserEntity(userBasic);
        userRepository.save(userEntity);
    }
    public UserBasic getUser(String id){
        Optional optional= userRepository.findById(id);
        if(!(optional.isPresent())){
            throw  new UserNotFoundException("CR001","User no registered on DB","", ZonedDateTime.now());
        }
        UserEntity userEntity= (UserEntity) optional.get();

    }

}
