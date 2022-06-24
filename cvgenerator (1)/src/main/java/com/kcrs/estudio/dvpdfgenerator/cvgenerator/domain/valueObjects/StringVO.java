package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects;


import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.IsNullValueException;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@ToString
public class StringVO {

    private final String value;

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
