package com.domain.sub.services.impl

import com.domain.sub.models.PorkAndBean
import com.domain.sub.services.EatService

class EatPorkAndBeanServiceImpl : EatService<PorkAndBean> {
    override fun eat(comida: PorkAndBean): String {
        return "Comi feijoada e teve gosto de ${comida.flavor()} e o preço dela é ${comida.price}"
    }
}