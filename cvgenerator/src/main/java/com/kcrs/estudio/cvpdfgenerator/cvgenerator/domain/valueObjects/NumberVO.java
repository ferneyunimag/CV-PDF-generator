package com.kcrs.estudio.cvpdfgenerator.cvgenerator.domain.valueObjects;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.domain.MalformedPhoneNumberException;

import java.time.ZonedDateTime;

public class NumberVO extends StringVO {

    public NumberVO(String value) {
        super(value);
        validate(value);
    }

    private String validate(String value) {
        String regex = "(0/91)?[7-9][0-9]{9}";
        if (!(value.matches(regex))) {
            throw new MalformedPhoneNumberException("Vo002", "malformed phone number, chek only contain characters 0-9 ",
                    "", ZonedDateTime.now());
        }
    return value;
    }

}
