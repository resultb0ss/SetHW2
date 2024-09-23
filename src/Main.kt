fun main() {
    var mySet = setOf(1,2,3,4,5,6,7,8,9,10,15,20,13,14,34)
    var newSet = mySet.map { it * 2 }.filter { it % 5 == 0 }
    println(newSet)
}