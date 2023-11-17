# Inheritance-Animals
Please write a program which will use the inheritance process and the multi-level class hierarchy.
The base class for all classes will be abstract Animal class, from which the following classes will be inherited: Mammal, Bird, Fish.
The Mammal class will be the base class of the Dog parent class.
The Fish class will be the base class for the Blowfish parent class.
The Bird class will be the base class for the parent Pigeon class.
Each class is a separate file in one package.The Animal class has name, age, and weight fields, and eat() and getVoice() abstract methods.
All classes have an additional field (e.g. the Bird: String featherColor class, and the Pigeon String: species class.)overrides the base class methods (giving them the proper sense for a given species) and adds its own one method specific to the given species class.
Each class is to have three constructors (default, using all parameters (also from base classes) and usingsomeparameters).
Each class has accessors (get and set for its fields) and a toString() method.
In the main class, we create an array of Animal reference and create all objects from our classes (using different designers). And then we call selected methods on individual indexes.
