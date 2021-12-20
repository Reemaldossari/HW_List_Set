import java.io.File

fun main () {

    var city = mutableListOf<String>("Riyadh", "Makkah", "Dammam")
    city.add("Jeddah")
    city.add("ALkharj")

    println(city)

    city.forEachIndexed { index, item -> println("$index $city") }


    var numbers = mutableListOf<Int>(1, 2, 3, 4, 5)

    numbers[2] = 12

    println(numbers)

    numbers.remove(12)

    println(numbers)
}


//(Options)
//    val text = File("Readfile /File_to_read.txt")
//
//        .readText()
//        .split("/n")
//
//    text.forEachIndexed { index, data ->
//        println("$index ,$data")
//
//
//    }
//
//    var num = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    num.maxOrNull()
//   println(num)
//
//
//}



