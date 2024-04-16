# Inheritance-Animals
# # Part 1
A program which will use the inheritance process and the multi-level class hierarchy.
The base class for all classes will be abstract Animal class, from which the following classes will be inherited: Mammal, Bird, Fish.
The Mammal class will be the base class of the Dog parent class.
The Fish class will be the base class for the Blowfish parent class.
The Bird class will be the base class for the parent Pigeon class.
Each class is a separate file in one package.The Animal class has name, age, and weight fields, and eat() and getVoice() abstract methods.
All classes have an additional field (e.g. the Bird: String featherColor class, and the Pigeon String: species class.)overrides the base class methods (giving them the proper sense for a given species) and adds its own one method specific to the given species class.
Each class is to have three constructors (default, using all parameters (also from base classes) and usingsomeparameters).
Each class has accessors (get and set for its fields) and a toString() method.
In the main class, we create an array of Animal reference and create all objects from our classes (using different designers). And then we call selected methods on individual indexes.

# # Part 2
Updated program with multi-level class hierarchy that we created on previous labs (those one with Animal abstract class).
This time, we have to add to this program three interfaces:
First: AnimalBehavior with one „normal” interface method called sleep().
This interface should implement classes in lover place in our hierarchy, so Dog, Pigeon and Blowfish – so in these classes we create some implementation of method sleep(). Than we create an array of AnimalBehavior reference and create objects from our three supclasses. And then we call methos sleep() on indivdual indexes.
Second: AnimalMove with one default method called move(), this method should print general info with the name of class it was called and info about Animal move. This interface will be implemented by all classes, but in classes Dog, 
Pigeon and Blowfish we change default implementation to more specific f.g. on console we should see such message: 
Dog run or Pigeon fly.
To print messages we create foreach loop on Animal array that we created on previous labs, on call on each element of array method move().
Third: AnimalName with one static method called name(), that in parameters recives: String name. This method we call on our interface in foreach loop with parameters getName() method on objects from array Animal (similar like in previous).
In the main class, we create an array of AnimalBehavior references and create all objects from classes that implemented this interface. And then we call selected methods on individual indexes.
