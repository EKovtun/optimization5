package ru.sber.dto

import kotlinx.serialization.Serializable

@Serializable
class PrimitiveDTO(
    val boolean: Boolean,
    val integer: Int,
    val double: Double,
)