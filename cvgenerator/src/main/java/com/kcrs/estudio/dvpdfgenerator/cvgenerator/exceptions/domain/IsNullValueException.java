package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.BadRequestException;

import java.time.ZonedDateTime;

public class IsNullValueException extends BadRequestException {


    public IsNullValueException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
