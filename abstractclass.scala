Abstract Class: Animal
abstract class Animal(val name: String) {
  def sound(): Unit
  // Primary constructor

  // Auxiliary constructor
  def this() = this("Unknown")

  def eat(): Unit = println(s"$name is eating...")
}

// Trait: Mammal
trait Mammal {
  def nurse(): Unit = println("Nursing...")
}

// Trait: Pet
trait Pet {
  def play(): Unit = println("Playing...")
}

// Concrete Class: Dog
class Dog(val breed: String) extends Animal(breed) with Mammal with Pet {
  override def sound(): Unit = println("Woof!")

  override def eat(): Unit = println(s"$breed is eating...")

  // Auxiliary constructor
  def this() = this("Golden Retriever")
}

// Concrete Class: Cat
class Cat(val color: String) extends Animal(color) with Mammal with Pet {
  override def sound(): Unit = println("Meow!")

  override def eat(): Unit = println(s"$color is eating...")

  // Auxiliary constructor
  def this() = this("Black")
}

// Main Class: AnimalKingdomTest
class AnimalKingdomTest {
  def run(): Unit = {
    val dog = new Dog("Poodle")
    dog.sound()
    dog.eat()
    dog.nurse()
    dog.play()

    val defaultDog = new Dog()
    defaultDog.sound()
    defaultDog.eat()
    defaultDog.nurse()
    defaultDog.play()

    val cat = new Cat("White")
    cat.sound()
    cat.eat()
    cat.nurse()
    cat.play()

    val defaultCat = new Cat()
    defaultCat.sound()
    defaultCat.eat()
    defaultCat.nurse()
    defaultCat.play()
  }
}

// Run the program
val test = new AnimalKingdomTest()
test.run()
