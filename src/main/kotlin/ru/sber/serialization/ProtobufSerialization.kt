package ru.sber.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import org.openjdk.jmh.annotations.*
import ru.sber.*
import java.util.concurrent.TimeUnit.SECONDS

@ExperimentalSerializationApi
@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 1)
@Measurement(iterations = 1, time = 1, timeUnit = SECONDS)
class ProtobufSerialization {
    @Benchmark
    fun protoArraySerialization() = ProtoBuf.encodeToByteArray(arrayDTO)

    @Benchmark
    fun protoInheritSerialization() = ProtoBuf.encodeToByteArray(inheritDTO)

    @Benchmark
    fun protoMapSerialization() = ProtoBuf.encodeToByteArray(mapDTO)

    @Benchmark
    fun protoNestedSerialization() = ProtoBuf.encodeToByteArray(nestedDTO)

    @Benchmark
    fun protoPrimitiveSerialization() = ProtoBuf.encodeToByteArray(primitiveDTO)

    @Benchmark
    fun protoStringSerialization() = ProtoBuf.encodeToByteArray(stringDTO)
}