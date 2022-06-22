package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.controller;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class PdfFailCreationException extends GeneralException {
    public  PdfFailCreationException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
