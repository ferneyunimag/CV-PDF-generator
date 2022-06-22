package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@AllArgsConstructor
@Setter
public class GeneralException extends RuntimeException{
    private  String Code;
    private  String message;
    private  String path;
    private ZonedDateTime timeStamp;
}
