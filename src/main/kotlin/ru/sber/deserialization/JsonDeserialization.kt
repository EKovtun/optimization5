package ru.sber.deserialization


import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.openjdk.jmh.annotations.*
import ru.sber.*
import ru.sber.dto.*
import java.util.concurrent.TimeUnit.SECONDS

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 1)
@Measurement(iterations = 1, time = 1, timeUnit = SECONDS)
class JsonDeserialization {

    private val arraySerialized = Json.encodeToString(arrayDTO)

    private val inheritSerialized = Json.encodeToString(inheritDTO)

    private val mapSerialized = Json.encodeToString(mapDTO)

    private val nestedSerialized = Json.encodeToString(nestedDTO)

    private val primitiveSerialized = Json.encodeToString(primitiveDTO)

    private val stringSerialized = Json.encodeToString(stringDTO)

    @Benchmark
    fun jsonArrayDeserialization(): ArrayDTO = Json.decodeFromString(arraySerialized)

    @Benchmark
    fun jsonInheritDeserialization(): InheritDTO = Json.decodeFromString(inheritSerialized)

    @Benchmark
    fun jsonMapDeserialization(): MapDTO = Json.decodeFromString(mapSerialized)

    @Benchmark
    fun jsonNestedDeserialization(): NestedDTO = Json.decodeFromString(nestedSerialized)

    @Benchmark
    fun jsonPrimitiveDeserialization(): PrimitiveDTO = Json.decodeFromString(primitiveSerialized)

    @Benchmark
    fun jsonStringDeserialization(): StringDTO = Json.decodeFromString(stringSerialized)
}