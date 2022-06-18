package com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.controller;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.http.NotFoundException;

import java.time.ZonedDateTime;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
