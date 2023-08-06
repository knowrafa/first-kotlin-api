package com.domain.sub.controllers.impl

import com.domain.sub.controllers.OperationController
import com.domain.sub.models.Operation
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.RuntimeException


class OperationControllerImpl: OperationController {

    override fun sum(
            numberOne: String?,
            numberTwo: String?
    ): Operation {
        // There's no difference between in throwing UnsupportedMathOperationException or RuntimeException, because they are the same thing
        // UnsupportedMathOperationException just passes the value to RuntimeException
        // if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw UnsupportedMathOperationException("Please set a numeric value")
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw RuntimeException("Please set a numeric value")
        return Operation(convertDouble(numberOne) + convertDouble(numberTwo))
    }
    
    private fun convertDouble(strNumber: String?): Double {
        if (strNumber.isNullOrBlank()) return 0.0
        val number = strNumber.replace(",".toRegex(), ".")
        return if (isNumeric(number)) number.toDouble() else 0.0
    }

    private fun isNumeric(strNumber: String?): Boolean {
        if (strNumber.isNullOrBlank()) return false
        val number = strNumber.replace(",".toRegex(), ".")
        return number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}