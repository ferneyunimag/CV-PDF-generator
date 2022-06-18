package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedPhoneNumberException;

import java.time.ZonedDateTime;

public class EmailVO extends StringVO {

    public EmailVO(String value) {
        super(value);
        validate(value);
    }

    private String validate(String value) {
        String regex = "/^[^\\s@]+@[^\\s@]+\\.[^\\s@]{2,}$/";
        if (!(value.matches(regex))) {
            throw new MalformedPhoneNumberException("Vo003", "malformed phone number, chek only contain characters 0-9 ",
                    "", ZonedDateTime.now());
        }
    return value;
    }

}
