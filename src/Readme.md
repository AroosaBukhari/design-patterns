**In Progress**

##What is a design pattern?

 A design pattern is a general repeatable solution to a commonly occurring problem in software design.
 A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.
 
 ###Uses
 1. Design patterns can speed up the development process by providing tested, proven development paradigms.
 2. Effective software design requires considering issues that may not become visible until later in the implementation.
 3. Reusing design patterns helps to prevent subtle issues that can cause major problems and improves code readability for coders and architects familiar with the patterns.
 4. Design patterns provide general solutions, documented in a format that doesn't require specifics tied to a particular problem.
 5. Patterns allow developers to communicate using well-known, well understood names for software interactions.
 
 ##Factory Design Pattern
 This is a Creational design pattern.
 Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class.
 This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 
 
 ##Adapter Pattern
 Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together.
 The object that joins these unrelated interface is called an Adapter.
 
 ##Observer Pattern
 Observer Pattern is one of the behavioral design pattern.
 Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. 
 In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.
 
 ##Iterator Pattern
 Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to traverse through a group of Objects.
 Iterator pattern is widely used in Java Collection Framework where Iterator interface provides methods for traversing through a collection.
 Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators based on our requirements.
 Iterator pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.
 
 
 ##Memento Pattern
 Memento design pattern is one of the behavioral design pattern.
 Memento design pattern is used when we want to save the state of an object so that we can restore later on.
 Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data.
 Memento pattern is implemented with two objects – Originator and Caretaker.
 Originator is the object whose state needs to be saved and restored and it uses an inner class to save the state of Object.
 The inner class is called Memento and it’s private, so that it can’t be accessed from other objects.
 
 
 ##Strategy Pattern **TODO**
 Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
 Strategy pattern is also known as Policy Pattern. We defines multiple algorithms and let client application pass the algorithm to be used as a parameter.

Source https://www.journaldev.com/1827/java-design-patterns-example-tutorial
