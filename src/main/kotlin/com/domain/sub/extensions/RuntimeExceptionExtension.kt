package com.domain.sub.extensions

import com.domain.sub.exceptions.ExceptionResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.context.request.WebRequest
import java.util.*

fun Exception.toResponse(request: WebRequest): ResponseEntity<ExceptionResponse> = ExceptionResponse(
    Date(),
    message,
    request.getDescription(false)
).let { self -> ResponseEntity<ExceptionResponse>(self, HttpStatus.I_AM_A_TEAPOT) }


// Criar os mastigation Service e um Mastigation controller via API
// Criar um único MastigationController que invoca o mastigation service adequado para a variável passada no post do método
// Como criar um método polimórfico no controller para descobrir um service que precisa ser invocado
// Polymorphic service implementation





