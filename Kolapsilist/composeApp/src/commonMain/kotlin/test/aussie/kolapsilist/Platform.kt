package test.aussie.kolapsilist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform