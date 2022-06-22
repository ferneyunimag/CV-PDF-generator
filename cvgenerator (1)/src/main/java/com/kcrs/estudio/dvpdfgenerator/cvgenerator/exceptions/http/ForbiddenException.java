package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class ForbiddenException extends GeneralException {
    public ForbiddenException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code,message, path, timeStamp);
    }
}
