package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.valueObjects;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedPhoneNumberException;

import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberVO extends StringVO {

    public NumberVO(String value) {
        super(value);
        validate(value);
    }

    private String validate(String value) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(value);
        if (!(matcher.find())) {
            throw new MalformedPhoneNumberException("Vo002", "malformed number, chek only contain characters 0-9 ",
                    "", ZonedDateTime.now());
        }
        return value;
    }

}
