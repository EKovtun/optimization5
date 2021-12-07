package ru.sber

import ru.sber.dto.*

val b = true
val d = 999.999
val i = 999
val s = "qwertyuiop[]1234567890-="
val arr = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val map = mapOf(1 to 1.1, 2 to 2.2, 3 to 3.3, 4 to 4.4, 5 to 5.5, 6 to 6.6, 7 to 7.7, 8 to 8.8, 9 to 9.9)

val primitiveDTO = PrimitiveDTO(b, i, d)

val stringDTO = StringDTO(s)

val arrayDTO = ArrayDTO(arr)

val mapDTO = MapDTO(map)

val inheritDTO = InheritDTO(arr, arr, map, map, s, s, b, b, i, i, d, d)

val nestedDTO = NestedDTO(arr, map, s, b, i, d, Nested(arr, map, s, b, i, d))