class Animals (name: String, animalType:String, like:String, sound:String) {
  var age = 2
  private var greeting = "runs away"
  def makesSound():Unit = {
    println(s"$name makes sound $sound")
  }
  def increaseAge (years:Int):Unit ={
    age = age + years
    }
  def meet () = println(s"If $name sees you, he $greeting")
  def otherMeet (otherGreeting:String) = {
    greeting = s"If $name sees you he wants $otherGreeting"
  }
}

