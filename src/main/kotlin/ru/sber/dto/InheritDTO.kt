package ru.sber.dto

import kotlinx.serialization.Serializable

@Serializable
class InheritDTO(
    val array: List<Int>,
    override val arrayInherited: List<Int>,
    val map: Map<Int, Double>,
    override val mapInherited: Map<Int, Double>,
    val string: String,
    override val stringInherited: String,
    val boolean: Boolean,
    override val booleanInherited: Boolean,
    val integer: Int,
    override val integerInherited: Int,
    val double: Double,
    override val doubleInherited: Double
) : Inherited()

@Serializable
sealed class Inherited {
    abstract val arrayInherited: List<Int>
    abstract val mapInherited: Map<Int, Double>
    abstract val stringInherited: String
    abstract val booleanInherited: Boolean
    abstract val integerInherited: Int
    abstract val doubleInherited: Double
}