package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.user;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.EmailVO;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.NumberVO;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects.StringVO;
import org.springframework.stereotype.Service;

@Service
public class UserBasicBuilder implements UserBasicBuilderInterface {

    private UserBasic userBasic;
    private StringVO id;
    private StringVO name;
    private EmailVO email;
    private NumberVO phone;

    public UserBasicBuilder() {
    }

    @Override
    public UserBasicBuilder withId(String id) {
        this.id= new StringVO(id);
        return this;
    }

    @Override
    public UserBasicBuilder withName(String name) {
        this.name= new StringVO(name);
        return this;
    }

    @Override
    public UserBasicBuilder withEmail(String email) {
        this.email= new EmailVO(email);
        return this;
    }

    @Override
    public UserBasicBuilder withPhone(String phone) {
        this.phone= new NumberVO(phone);
        return this;
    }
    @Override
    public UserBasic build() {
        userBasic= new UserBasic();
        userBasic.setId(this.id);
        userBasic.setName(this.name);
        userBasic.setEmail(this.email);
        userBasic.setPhone(this.phone);
        return userBasic;
    }
}
