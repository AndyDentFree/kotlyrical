package test.aussie.kolapsilist

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(ExperimentalUuidApi::class)
actual fun randomUUIDString() : String = Uuid.random().toString()