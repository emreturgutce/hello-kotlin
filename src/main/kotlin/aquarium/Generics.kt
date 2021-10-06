package aquarium

// out generic => will only be returned not consumed
// in generic => it can only be consumed never produced
// special case => constructors can take out type as param

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() = apply { needsProcessed = true }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() = apply { needsProcessed = false }
}

class MyAquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }

        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

fun addItemTo(aquarium: MyAquarium<WaterSupply>) = println("item added")

fun genericExample() {
    val aquarium = MyAquarium(TapWater())

    addItemTo(aquarium)
}
