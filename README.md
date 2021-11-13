# ZooGameApp
Zoo simulation with games.

[![Known Vulnerabilities](https://snyk.io/test/github/satheesheppalapelli/ZooGameApp/badge.svg)](https://snyk.io/test/github/satheesheppalapelli/ZooGameApp)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/51c43cd1ed734ac3af4c9576280f0208)](https://www.codacy.com/gh/satheesheppalapelli/ZooGameApp/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=satheesheppalapelli/ZooGameApp&amp;utm_campaign=Badge_Grade)

## API

- Explore API at <https://satheesheppalapelli.github.io/ZooGameApp/edu/nwmissouri/zoo05group/package-summary.html>
- Generate API with `mvn javadoc:javadoc`

## Test Coverage

- Explore test coverage at https://gayatridevabhaktuni.github.io/ZooGameApp-CodeCoverage/
  
  Open Powershell Here as Admininstrator in your root project folder (the one with pom.xml):
- Prepare test results with 
  ``` mvn clean jacoco:prepare-agent install ```
- Prepare coverage site with 
  ``` mvn jacoco:report ```
- This builds target/site/jacoco which is then copied to the hosted repo above.

## pom.xml

These have been updated. Find these in pom.xml
* java.version = 17
* junit = 5.8.1
* maven - see different versions by plugin

## Web App

A user interface (besides the console) would be nice. We voted on a web front end.
```
  $ mvn clean package spring-boot:repackage
  $ java -jar target/Zoo04Lab-1.0-SNAPSHOT
```

## Principles of Object-Oriented Programming (OOP)
* ***Encapsulation***. Wrap code in good interfaces. Hide private data, expose publicly accessible methods.
* ***Abstraction***. Abstract general ideas that work for many, e.g. move is an abstraction of crawl, slither, fly.
* ***Inheritance***. Write once in a parent class and all the derived child classes get it for free.
* ***Polymorphism***. "Many shapes". One thing (e.g. move) can take many forms, e.g. a snake might move by slithering, while a bird might move by flying.

## SOLID Principles 
* Single Responsibility Principle. Only one reason to change.
* Open-Closed Principle. Open for extesion; closed for modification.
* Liskov Substitution Principle. Use derived class just like base.
* Interface Segregation Principle. Many client-specific interfaces.
* Dependency Inversion Principle. Depend on abstract rather than concrete.
