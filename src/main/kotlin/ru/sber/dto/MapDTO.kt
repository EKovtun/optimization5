package ru.sber.dto

import kotlinx.serialization.Serializable

@Serializable
class MapDTO(val map: Map<Int, Double>)