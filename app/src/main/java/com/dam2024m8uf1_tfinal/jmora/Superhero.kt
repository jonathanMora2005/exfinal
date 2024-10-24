package com.dam2024m8uf1_tfinal.jmora


import java.time.LocalDate

data class Superheroe(
    val name: String,
    val realName: String,
    val age: Int,
    val debutYear: LocalDate,
    val homePlanet: String,
    val urlImage: String,
    val isAlien: Boolean,
    val power: Double,
    val publisher: String,
    val creator: String,
    val numberOfComicsAppeared: Int,
    val cinematicUniverse: String,
    val hasMovieAdaptation: Boolean
)
