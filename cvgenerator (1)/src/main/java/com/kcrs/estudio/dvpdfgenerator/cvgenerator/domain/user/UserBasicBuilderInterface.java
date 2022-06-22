package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user;

public interface UserBasicBuilderInterface {

    UserBasic build();
    UserBasicBuilder withId(String id);
    UserBasicBuilder withName(String name);
    UserBasicBuilder withEmail(String email);
    UserBasicBuilder withPhone(String phone);
}
