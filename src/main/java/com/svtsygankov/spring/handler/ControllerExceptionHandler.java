package com.svtsygankov.spring.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception exception, HttpServletRequest httpServletRequest) {
        log.error("Failed to return response");
        return "error/error500";
    }
}
