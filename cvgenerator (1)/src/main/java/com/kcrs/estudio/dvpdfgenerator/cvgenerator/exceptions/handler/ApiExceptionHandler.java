package com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.handler;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.GeneralException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.IsNullValueException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedEmailException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.domain.MalformedPhoneNumberException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.BadRequestException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.ForbiddenException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.NotFoundException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.http.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({BadRequestException.class,
            GeneralException.class,
            IsNullValueException.class,
            MalformedPhoneNumberException.class,
            MalformedEmailException.class,
            HttpRequestMethodNotSupportedException.class,
            MethodArgumentNotValidException.class,
            MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class,
            HttpMessageNotReadableException.class})
    @ResponseBody
    public ErrorMessage badRequest(HttpServletRequest request, BadRequestException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({UnauthorizedException.class})
    public void unauthorized(HttpServletRequest request, UnauthorizedException e) {
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({NotFoundException.class})
    @ResponseBody
    public ErrorMessage notFound(HttpServletRequest request, NotFoundException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ForbiddenException.class})
    @ResponseBody
    public ErrorMessage forbidden(HttpServletRequest request, ForbiddenException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ErrorMessage fatalErrorException(HttpServletRequest request, Throwable e) {
        return new ErrorMessage((GeneralException) e, request.getRequestURI());
    }


}
