package com.domain.sub.exceptions.handlers

import com.domain.sub.exceptions.ExceptionResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*
import kotlin.Exception

// Default exception handler. Will not work for Authentication Exceptions.
@ControllerAdvice
class RuntimeExceptionHandler : ResponseEntityExceptionHandler() {
    @ExceptionHandler(java.lang.RuntimeException::class)
    fun handleRuntimeExceptions(ex: Exception, request: WebRequest):
            ResponseEntity<ExceptionResponse> {
        val exceptionResponse = ExceptionResponse(
            Date(),
            ex.message,
            request.getDescription(false)
        )
        return ResponseEntity<ExceptionResponse>(exceptionResponse, HttpStatus.I_AM_A_TEAPOT)

    }
}