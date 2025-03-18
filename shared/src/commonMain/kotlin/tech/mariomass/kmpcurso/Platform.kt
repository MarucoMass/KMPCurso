package tech.mariomass.kmpcurso

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform