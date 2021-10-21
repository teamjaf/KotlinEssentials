package chapter4._04_02.begin

fun main() {
    val names = listOf("Daisy", "Hattan", "Rob")
    println("The first name is ${names.get(0)}")
    println("The first name is ${names[2]}")


    val subList = names.subList(0,3)
    println(subList)

    val items = mutableListOf(1,2,3,4,5)
    items[0] = 50
    print(items)

    items.add(12)
    items.removeAt(3)
    items.remove(99)
    println(items)
    println("There are ${items.size} items")
    println("The first item is ${items.first()}")
    print(items)
}

