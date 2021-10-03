fun main(args: Array<String>) {
    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red")
    symptoms.contains("red spots")

    println(symptoms.subList(4, symptoms.size))

    listOf(1, 5, 3).sum()

    listOf("a", "b", "cc").sumOf { it.length }

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    cures["white spots"]

    val inventory = mutableMapOf("fish net" to 1)

    inventory["tank scrubber"] = 3
}
