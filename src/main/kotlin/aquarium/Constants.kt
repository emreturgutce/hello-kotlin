package aquarium

// - type will be decided at compile time
// - works only at top level and object classes
// - if you want to use const in class you need to create companion object
const val rocks = 3

// type will be decided at runtime/execution
val number = 5

object Constants {
    const val CONSTANT = "constant"
}

class MyClass {
    companion object {
        const val CONSTANT2 = "constant"
    }
}
