package com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.domain;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.http.BadRequestException;

import java.time.ZonedDateTime;

public class IsNullValueException extends BadRequestException {


    public IsNullValueException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
