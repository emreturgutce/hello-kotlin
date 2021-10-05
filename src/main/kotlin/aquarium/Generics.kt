package aquarium

class MyList<T> {
    private val list: MutableList<T> = mutableListOf()

    fun getItem(pos: Int): T {
        return list[pos]
    }

    fun addItem(item: T): Int {
        list.add(item)
        return list.size - 1
    }
}

fun main() {
    val myStrList = MyList<String>()

    val idx = myStrList.addItem("Emre")
    println(myStrList.getItem(idx))
}
