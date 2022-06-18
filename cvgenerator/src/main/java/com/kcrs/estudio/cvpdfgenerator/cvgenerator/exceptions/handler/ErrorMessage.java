package com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.handler;

import com.kcrs.estudio.cvpdfgenerator.cvgenerator.exceptions.GeneralException;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ErrorMessage {
    private String code;
    private String exception;
    private String message;
    private String path;
    private String timeStamp;

    public ErrorMessage(GeneralException e, String path) {
        this.code= e.getCode();
        this.exception = e.getClass().getSimpleName();
        this.message = e.getMessage();
        this.path = path;
        this.timeStamp = e.getTimeStamp().toString();
    }
}
