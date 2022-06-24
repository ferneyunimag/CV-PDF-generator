package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedEmailException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedPhoneNumberException;

import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVO extends StringVO {

    public EmailVO(String value) {
        super(value);
        validate(value);
    }

    private void validate(String value) {
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(value);
        if (!(matcher.find())) {
            throw new MalformedEmailException("Vo003", "malformed email esctructure, validate estructure info@info.info ",
                    "", ZonedDateTime.now());
        }
    }

}
