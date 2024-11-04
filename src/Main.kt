fun main() {
    val CapitalsNearMe = mutableMapOf(
        "Illinois" to "Chicago",
        "Kentucky" to "Frankfort",
        "Ohio" to "Colombus",
        "Boston" to "Masachusetts"
    )
    CapitalsNearMe["Kentucky"] = "FrankFort"
    CapitalsNearMe["Ohio"] = "Colombus"
    CapitalsNearMe["Illinois"] = "Chicago"
    CapitalsNearMe.remove("Boston")
    println(CapitalsNearMe["Ohio"])
    println(CapitalsNearMe)

    val HealthyFood = mutableListOf(
        1, "Apple",
        2, "Mango"


    )
    HealthyFood.add("Orange")
    HealthyFood[1] = "Broccoli"
    HealthyFood.remove("Apple")
    HealthyFood.removeAt(3)
    println(HealthyFood)
}
