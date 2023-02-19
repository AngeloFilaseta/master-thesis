val format = Json { serializersModule = concentrationModule }
val concentration: Any = ConcentrationSurrogateMock(name = "example")
println(format.encodeToString(PolymorphicSerializer(Any::class), concentration))
// OUTPUT {"type":"ConcentrationSurrogateMock","name":"example"}
