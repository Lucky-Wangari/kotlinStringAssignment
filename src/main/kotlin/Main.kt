fun main() {
    val name = "AkiraChix"
    println(name[0]+""+name[2]+name[3])
    myName("Gail", "27")
    saying("there are many programming languages")
    sentence("Lucky")
    sentence("Reagan")
}

fun myName(name: String, age: String): String{
    val statement = "Hi my name is $name and I am $age years old"
   return statement
}
 fun saying(InputString: String): Int{
     return InputString.length
}
fun sentence(name: String, ) {
    if (name == "Lucky") {
        println("That's me")
  } else {
      println("I don't know who that is")
  }
}





