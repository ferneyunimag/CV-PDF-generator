package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException{
    private  String Code;
    private  String message;
    private  String path;
    private ZonedDateTime timeStamp;
}
