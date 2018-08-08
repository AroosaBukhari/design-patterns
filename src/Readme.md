**In Progress**

## What is a design pattern?

 A design pattern is a general repeatable solution to a commonly occurring problem in software design.
 A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.
 
 ### Uses
 1. Design patterns can speed up the development process by providing tested, proven development paradigms.
 2. Effective software design requires considering issues that may not become visible until later in the implementation.
 3. Reusing design patterns helps to prevent subtle issues that can cause major problems and improves code readability for coders and architects familiar with the patterns.
 4. Design patterns provide general solutions, documented in a format that doesn't require specifics tied to a particular problem.
 5. Patterns allow developers to communicate using well-known, well understood names for software interactions.
 
 ***
 ## Factory Design Pattern
 This is a Creational design pattern.
 Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class.
 This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 
 **For example**, Let’s say we have two sub-classes PC and Server extending a Computer super class.
 In a factory class different subclass is created and returned based on the input parameter.
 
 ***
 ## Adapter Pattern
 Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together.
 The object that joins these unrelated interface is called an Adapter.
 
**For example**, mobile charger works as an adapter between mobile charging socket and the wall socket, lets build an adapter that can produce 3 volts, 12 volts and default 120 volts.  

 ***
 ## Observer Pattern
 Observer Pattern is one of the behavioral design pattern.
 Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. 
 In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.
 Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers can register and unregister themselves. 
 Subject also contain a method to notify all the observers of any change and either it can send the update while notifying the observer or it can provide another method to get the update.
 Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates.
 
 **For example**, a simple topic and observers can register to this topic. 
 Whenever any new message will be posted to the topic, all the registers observers will be notified and they can consume the message.
 
 ***
 ## Iterator Pattern
 Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to traverse through a group of Objects.
 Iterator pattern is widely used in Java Collection Framework where Iterator interface provides methods for traversing through a collection.
 Iterator pattern is not only about traversing through a collection, we can provide different kind of iterators based on our requirements.
 Iterator pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods.
 
 **For example**, Suppose we have a list of Radio channels and the client program want to traverse through them one by one or based on the type of channel.
 Some client programs are only interested in English channels and want to process only them, they don’t want to process other types of channels.
 
 ***
 ## Memento Pattern
 Memento design pattern is one of the behavioral design pattern.
 Memento design pattern is used when we want to save the state of an object so that we can restore later on.
 Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data.
 Memento pattern is implemented with two objects – Originator and Caretaker.
 Originator is the object whose state needs to be saved and restored and it uses an inner class to save the state of Object.
 The inner class is called Memento and it’s private, so that it can’t be accessed from other objects.
 Caretaker is the helper class that is responsible for storing and restoring the Originator’s state through Memento object. 
 Since Memento is private to Originator, Caretaker can’t access it and it’s stored as an Object within the caretaker.
 
 **For example**, we can write and save contents to a File anytime and we can restore it to last saved state. 
 
 ***
 ## Strategy Pattern 
 Strategy design pattern is one of the behavioral design pattern. It is also known as Policy Pattern.
 Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
 Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
 Strategy pattern is useful when we have multiple algorithms for specific task and we want our application to be flexible to chose any of the algorithm at runtime for specific task.
 
 **For example**, we will try to implement a simple Shopping Cart where we have two payment strategies – using Credit Card or using PayPal.
 First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument.

 ***
 ## Singleton Pattern
 Singleton pattern is a creational design pattern.
 Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine. 
 It must provide a global access point to get the instance of the class. Singleton pattern is used for logging, drivers objects, caching and thread pool.
 Therefore it must have :
 + Private constructor to restrict instantiation of the class from other classes.
 + Private static variable of the same class that is the only instance of the class.
 + Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class. 
  
 
 
Source https://www.journaldev.com/1827/java-design-patterns-example-tutorial
