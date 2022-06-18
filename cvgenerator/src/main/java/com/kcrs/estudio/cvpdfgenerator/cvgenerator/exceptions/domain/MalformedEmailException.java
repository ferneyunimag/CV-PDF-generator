package com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.domain;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.http.BadRequestException;

import java.time.ZonedDateTime;

public class MalformedEmailException extends BadRequestException {


    public MalformedEmailException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
