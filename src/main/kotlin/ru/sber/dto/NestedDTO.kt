package ru.sber.dto

import kotlinx.serialization.Serializable

@Serializable
class NestedDTO(
    val array: List<Int>,
    val map: Map<Int, Double>,
    val string: String,
    val boolean: Boolean,
    val integer: Int,
    val double: Double,
    val nested: Nested
)

@Serializable
class Nested(
    val array: List<Int>,
    val map: Map<Int, Double>,
    val string: String,
    val boolean: Boolean,
    val integer: Int,
    val double: Double,
)