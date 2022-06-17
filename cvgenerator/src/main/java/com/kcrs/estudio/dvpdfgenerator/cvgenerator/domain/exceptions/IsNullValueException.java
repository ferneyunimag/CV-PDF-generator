package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions;

import java.time.ZonedDateTime;

public class IsNullValueException extends BadRequestException {


    public IsNullValueException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
