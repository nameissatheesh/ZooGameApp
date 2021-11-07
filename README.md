# ZooGameApp
Zoo simulation with games.

## API

- Explore API at <https://satheesheppalapelli.github.io/ZooGameApp/edu/nwmissouri/zoo05group/package-summary.html>
- Generate API with `mvn javadoc:javadoc`

# pom.xml

These have been updated. Find these in pom.xml
* java.version = 17
* junit = 5.8.1
* maven - see different versions by plugin

# Principles of Object-Oriented Programming (OOP)
* Encapsulation. Wrap code in good interfaces. Hide private data, expose publicly accessible methods.
* Abstraction. Abstract general ideas that work for many, e.g. move is an abstraction of crawl, slither, fly.
* Inheritance. Write once in a parent class and all the derived child classes get it for free.
* Polymorphism. "Many shapes". One thing (e.g. move) can take many forms, e.g. a snake might move by slithering, while a bird might move by flying.

# SOLID Principles 
* Single Responsibility Principle. Only one reason to change.
* Open-Closed Principle. Open for extesion; closed for modification.
* Liskov Substitution Principle. Use derived class just like base.
* Interface Segregation Principle. Many client-specific interfaces.
* Dependency Inversion Principle. Depend on abstract rather than concrete.
