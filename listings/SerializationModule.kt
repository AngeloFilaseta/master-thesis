val concentrationModule = SerializersModule {
    polymorphic(Any::class) {
        subclass(ConcentrationSurrogateMock::class)
        default { EmptyConcentrationSurrogate.serializer() }
    }
}
