package ru.sber.deserialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import kotlinx.serialization.protobuf.ProtoBuf
import org.openjdk.jmh.annotations.*
import ru.sber.*
import ru.sber.dto.*
import java.util.concurrent.TimeUnit.SECONDS

@ExperimentalSerializationApi
@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 1)
@Measurement(iterations = 1, time = 1, timeUnit = SECONDS)
class ProtobufDeserialization {

    private val arraySerialized = ProtoBuf.encodeToByteArray(arrayDTO)

    private val inheritSerialized = ProtoBuf.encodeToByteArray(inheritDTO)

    private val mapSerialized = ProtoBuf.encodeToByteArray(mapDTO)

    private val nestedSerialized = ProtoBuf.encodeToByteArray(nestedDTO)

    private val primitiveSerialized = ProtoBuf.encodeToByteArray(primitiveDTO)

    private val stringSerialized = ProtoBuf.encodeToByteArray(stringDTO)

    @Benchmark
    fun protoArrayDeserialization(): ArrayDTO = ProtoBuf.decodeFromByteArray(arraySerialized)

    @Benchmark
    fun protoInheritDeserialization(): InheritDTO = ProtoBuf.decodeFromByteArray(inheritSerialized)

    @Benchmark
    fun protoMapDeserialization(): MapDTO = ProtoBuf.decodeFromByteArray(mapSerialized)

    @Benchmark
    fun protoNestedDeserialization(): NestedDTO = ProtoBuf.decodeFromByteArray(nestedSerialized)

    @Benchmark
    fun protoPrimitiveDeserialization(): PrimitiveDTO = ProtoBuf.decodeFromByteArray(primitiveSerialized)

    @Benchmark
    fun protoStringDeserialization(): StringDTO = ProtoBuf.decodeFromByteArray(stringSerialized)
}