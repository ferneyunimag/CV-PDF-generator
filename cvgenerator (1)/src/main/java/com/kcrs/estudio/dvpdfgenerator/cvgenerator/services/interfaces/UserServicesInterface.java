package com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.interfaces;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user.UserBasic;

import java.util.List;

public interface UserServicesInterface {

    void saveUser(UserBasic userBasic);
    List<UserBasic> getAllUsers();
}
