# CreationalDesignPattern

### what is singleton 
Singleton design pattern is a creational design pattern which allow us to create single instance of the class.

## Implementation

### For a Single-Threaded Application

To implement Singleton in a single-threaded application:

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