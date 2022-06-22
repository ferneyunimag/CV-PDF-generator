package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.controller;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.NotFoundException;

import java.time.ZonedDateTime;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
