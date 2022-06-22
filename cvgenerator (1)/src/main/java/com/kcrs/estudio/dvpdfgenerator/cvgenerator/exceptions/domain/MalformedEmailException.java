package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.BadRequestException;

import java.time.ZonedDateTime;

public class MalformedEmailException extends BadRequestException {


    public MalformedEmailException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
