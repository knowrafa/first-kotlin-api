package com.domain.sub.exceptions.handlers

import com.domain.sub.exceptions.ExceptionResponse
import com.domain.sub.extensions.toResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import kotlin.Exception

// Default exception handler. Will not work for Authentication Exceptions.
@ControllerAdvice
class GenericExceptionHandler : ResponseEntityExceptionHandler() {
    @ExceptionHandler(java.lang.Exception::class)
    fun handleAllExceptions(ex: Exception, request: WebRequest):
            ResponseEntity<ExceptionResponse> {
        return ex.toResponse(request)
    }
}