package aquarium

// private = visible inside file
// internal = visible inside module

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println(
        "Length: ${myAquarium.length} " +
                "Width: ${myAquarium.width} " +
                "Height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height}cm")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)

    println("volume of small: ${smallAquarium.volume}")

    val myAquarium2 = Aquarium(numberOfFish = 9)
}