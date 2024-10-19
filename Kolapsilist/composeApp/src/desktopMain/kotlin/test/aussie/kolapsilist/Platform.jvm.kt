package test.aussie.kolapsilist

import java.util.*

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()

actual fun randomUUIDString() : String = UUID.randomUUID().toString()