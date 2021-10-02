package aquarium

// singleton
object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {}
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// can only be subclassed only inside the file
sealed class Seal

class SeaLion: Seal()

class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is SeaLion -> "Sea lion"
        is Walrus -> "Walrus"
    }
}
