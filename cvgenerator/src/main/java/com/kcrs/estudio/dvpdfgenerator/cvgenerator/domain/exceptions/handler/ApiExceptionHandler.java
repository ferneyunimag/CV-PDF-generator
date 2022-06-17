package com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.handler;


import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.BadRequestException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.ErrorMessage;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.GeneralException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.domain.exceptions.IsNullValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({BadRequestException.class,
            GeneralException.class,
            IsNullValueException.class})
    @ResponseBody
    public ErrorMessage badRequest(HttpServletRequest request, GeneralException e) {
        return new ErrorMessage(e,request.getRequestURI());
    }


}
