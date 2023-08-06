package com.domain.sub.services.impl

import com.domain.sub.models.Strogonoff
import com.domain.sub.services.EatService


class EatStrogonoffServiceImpl : EatService<Strogonoff> {
    override fun eat(comida: Strogonoff): String {
        return "Mastiguei frango e teve gosto de ${comida.flavor()}"
    }
}