object AnimalDef extends App {
val dog = new Animals("Dog", "Mammal", "to play", "Barf" )
val cat = new Animals("Cat", "Mammal", "to sleep", "Meow" )
println(dog.age)
cat.increaseAge(years = 3)
  println(cat.age)
dog.makesSound()
cat.makesSound()
dog.meet()
cat.otherMeet(otherGreeting = "say hello")


}
