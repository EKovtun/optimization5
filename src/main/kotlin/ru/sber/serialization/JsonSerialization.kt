package ru.sber.serialization


import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.openjdk.jmh.annotations.*
import ru.sber.*
import java.util.concurrent.TimeUnit.SECONDS

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 1)
@Measurement(iterations = 1, time = 1, timeUnit = SECONDS)
class JsonSerialization {
    @Benchmark
    fun jsonArraySerialization() = Json.encodeToString(arrayDTO)

    @Benchmark
    fun jsonInheritSerialization() = Json.encodeToString(inheritDTO)

    @Benchmark
    fun jsonMapSerialization() = Json.encodeToString(mapDTO)

    @Benchmark
    fun jsonNestedSerialization() = Json.encodeToString(nestedDTO)

    @Benchmark
    fun jsonPrimitiveSerialization() = Json.encodeToString(primitiveDTO)

    @Benchmark
    fun jsonStringSerialization() = Json.encodeToString(stringDTO)
}