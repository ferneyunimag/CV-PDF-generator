package com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects;


import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.domain.IsNullValueException;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class StringVO {

    private String value;

    public StringVO(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) throws IsNullValueException {
        if(value.equals("") || value == null){
         throw new IsNullValueException("Vo001"," String Value Object must not be null","", ZonedDateTime.now());
        }
    }




}
