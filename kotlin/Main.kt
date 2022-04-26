import java.util.Scanner

fun main(args: Array<String>) {

 // How to get input from user with the help of Scenner
 var scenner = Scanner(System.`in`)

  println("Enter a number: ")
 var number1 = scenner.nextInt()
 println("Enter another number: ")
 var number2 = scenner.nextInt()

  var result = number1%number2
  println("result is $result")



/// I can use readLine() method to get data from user
// readLine() only works for String input


// println("Enter your name: ")
// var name = readLine()
// print("Input name is $name")
//

 // redaLin() to get integer, float and double and so on

// println("Enter a number: ")
// var number1 = readLine()!!.toInt()
// println("Enter another number: ")
// var number2 = readLine()!!.toInt()
//
// var result = number1/number2
// println("Result $result")

}
