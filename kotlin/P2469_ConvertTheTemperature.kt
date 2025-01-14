fun convertTemperature(celsius: Double): DoubleArray {
    val kelvin = celsius + 273.15
    val fahrenheit = celsius * 1.80 + 32.00
    
    return doubleArrayOf(kelvin, fahrenheit)
}

fun main() {
    val celsius1 = 36.50
    val celsius2 = 122.11

    println("Input: celsius = $celsius1")
    println("Output: ${convertTemperature(celsius1).joinToString(", ")}")
    
    println("Input: celsius = $celsius2")
    println("Output: ${convertTemperature(celsius2).joinToString(", ")}")
}