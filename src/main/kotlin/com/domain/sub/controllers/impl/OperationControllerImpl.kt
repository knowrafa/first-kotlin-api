package com.domain.sub.controllers.impl

import com.domain.sub.controllers.OperationController
import com.domain.sub.converters.NumberConverter
import com.domain.sub.math.SimpleMath
import com.domain.sub.models.Operation
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException
import kotlin.math.sqrt
@RestController
class OperationControllerImpl : OperationController {
    private val math = SimpleMath()
    override fun sum(
        numberOne: String?,
        numberTwo: String?
    ): Operation {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(math.sum(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo)))
    }

    override fun sub(
        numberOne: String?,
        numberTwo: String?
    ): Operation {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(math.sub(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo)))
    }

    override fun multiplication(
        numberOne: String?,
        numberTwo: String?
    ): Operation {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(
            math.multiplication(
                NumberConverter.convertDouble(numberOne),
                NumberConverter.convertDouble(numberTwo)
            )
        )
    }

    override fun division(
        numberOne: String?,
        numberTwo: String?
    ): Operation {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(
            math.division(
                NumberConverter.convertDouble(numberOne),
                NumberConverter.convertDouble(numberTwo)
            )
        )
    }

    override fun average(
        numberOne: String?,
        numberTwo: String?
    ): Operation {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(
            math.average(
                NumberConverter.convertDouble(numberOne),
                NumberConverter.convertDouble(numberTwo)
            )
        )
    }

    override fun squareRoot(
        number: String?
    ): Operation {
        if (!NumberConverter.isNumeric(number)) throw RuntimeException("Please set a numeric value")
        return Operation(math.squareRoot(NumberConverter.convertDouble(number)))
    }

}