package aquarium

// private = visible inside file
// internal = visible inside module

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
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

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark ${shark.color} \n Plecostomus ${pleco.color}")
}