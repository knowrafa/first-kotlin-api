package com.domain.sub.services.impl

import com.domain.sub.services.EatService
import com.domain.sub.models.PaoDeQueijo

class EatPaoDeQueijoServiceImpl : EatService<PaoDeQueijo> {
    override fun eat(comida: PaoDeQueijo): String {
        return "Comi pão de queijo e teve gosto de ${comida.flavor()}"
    }
}