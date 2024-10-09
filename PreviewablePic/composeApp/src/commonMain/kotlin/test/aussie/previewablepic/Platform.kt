package test.aussie.previewablepic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform