package com.domain.sub.services

import com.domain.sub.models.Hamburger

class EatHamburgerServiceImpl : EatService<Hamburger> {
    override fun eat(comida: Hamburger) = "Comi um hamburger e tinha gosto de ${comida.flavor()}"
}