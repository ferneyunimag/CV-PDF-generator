package com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.http;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class UnauthorizedException extends GeneralException {
    public UnauthorizedException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code,message, path, timeStamp);
    }
}
