package aquarium

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces()
}

class AquariumPlant(var color: String, private val size: Int)

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun AquariumPlant?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant: AquariumPlant? = null

    plant.pull()
}