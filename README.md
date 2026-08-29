# CreationalDesignPattern

### what is singleton 
Singleton design pattern is a creational design pattern which allow us to create single instance of the class.

## Implementation

### For a Single-Threaded Application

1. Create a private and static instance variable of the same class.
2. Make the constructor private so that objects cannot be created from
   outside the class.
3. Create a static method that provides access to the Singleton instance.
4. Inside the method, check whether the object is `null`.
5. If the object is `null`, create a new instance.
6. Otherwise, return the already existing instance.

### For a Multi-Threaded Application
1. I used the same logic with a locking mechanism, which is private, static, and final.
2. I used two checks inside the `getObj()` method.
3. The first check is mainly used to avoid acquiring the lock unnecessarily.
4. I used the second check with the lock, which creates the critical section where the actual object will be created.
5. In the first check, if `obj == null`, it goes inside the condition; otherwise, it returns the object.
6. Inside the condition, the lock will be applied to the thread. If `obj == null`, the object will be created and the lock will be released; 
   otherwise, the existing object will be returned.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
### BUILDER DESIGN PATTERN
## What is Builder Design Pattern?
Builder Design Pattern is a creational design pattern which is used when we want to create an object 
step by step with proper validation.

## Implementation
1. I have used a Student class which has some private attributes (name, email, contactNo) which should not be null, blank, or incorrect.
2. To apply those validations, I have used an inner class called StudentBuilder, which has all the attributes of the Student class. 
   It is static because it should be accessible by other classes without creating a Student object.
3. Then I have implemented a static method which returns the object of the StudentBuilder class.
4. By using the StudentBuilder class, we can set the attributes and validate those attributes inside the StudentBuilder class.
5. We have methods inside the StudentBuilder class which I have used for setting the values of the attributes.
-----------------------------------------------------------------------------------------------------------------------------------------------------------
### Factory design pattern and abstract factory
## what is Factory design pattern ?
Factory Design Pattern is a creational design pattern that is used to create objects without exposing the object-creation logic to the client.
## What is abstract factory ?
Abstract Factory is a creational design pattern that provides an interface for creating a family of related objects without specifying their 
concrete classes.
## Factory design pattern implementation
1. To implement the Factory Design Pattern, I took an example of creating database objects where multiple types of databases are available.
2. To handle multiple databases, I created one interface, DbConnection, which has common methods such as connectDb() and executeQuery().
3. Now, every database class implements the DbConnection interface, and each class has its own implementation of the connectDb() and executeQuery() methods.
4. Then, I implemented the DatabaseFactory, which has a create() method that takes a database name and returns the corresponding object.
## Abstract Factory design pattern implementation
1. There are multiple databases that have their own way of executing queries.To resolve this issue, I created one interface, DbQuery,
   which has some common functions that are used by all databases. 
2. Then, I created the classes MongoDbQuery and MySqlQuery corresponding to each database, which implement the DbQuery interface.
   I also created an interface DatabaseFactory, which has methods for creating both the database connection and the corresponding query object.
3. Then, I created the MySqlFactory and MongoDbFactory classes, which implement the DatabaseFactory interface. The MySqlFactory creates the related 
   MySqlDb and MySqlQuery objects, while the MongoDbFactory creates the related MongoDb and MongoDbQuery objects.
4. In this way, the Abstract Factory creates a family of related objects without directly exposing their concrete classes to the client.
   


