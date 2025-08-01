fun main() {
  print("Enter first number: ")
  var number1 = readLine()?.toDoubleOrNull()

  print("Enter second number: ")
  var number2 = readLine()?.toDoubleOrNull()

  print("Enter operation (+, -, *, /): ")
  val operation = readLine()

  if (number1 == null || number2 == null || operation == null) {
    println("Invalid input.")
    return
  }

  when (operation) {
    "+" -> println("Result: ${number1 + number2}")
    "-" -> println("Result: ${number1 - number2}")
    "*" -> println("Result: ${number1 * number2}")
    "/" -> {
      if (number2 != 0.0) {
        println("Result: ${number1 / number2}")
      } else {
        println("Error: Division by zero.")
      }
    }
    else -> println("Unknown operation.")
  }

}