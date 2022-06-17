package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects;


import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.IsNullValueException;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
public class StringVO {

    private String value;

    public StringVO(String value) throws IsNullValueException {
        validate(value);
        this.value = value;
    }

    private void validate(String value) throws IsNullValueException {
        if(value.equals("") || value == null){
         throw new IsNullValueException("Vo001"," String Value Object must not be null","", ZonedDateTime.now());
        }
    }




}
