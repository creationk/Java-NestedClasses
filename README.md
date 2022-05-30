# JavaBasic-Projects-NestedClasses

- Nested classes are simply classes defined inside other classes. 
- Nested classes can be used to increase encapsulation and make your code more readable and maintainable.
- If you have a class that is only being used in one place, then making it a nested class may be a good idea.

![](src/main/resources/inner_classes.png?raw=true)

- There are two types of nested classes:
  ## static nested class  
    A static nested class is any class that's defined within another class and declared static. Specifically, a static nested class abides by the following rules:
    - can have any type of access modifier in its declaration (public, private, etc)
    - can only access other static members of it's parent class
    - can define both static and non-static members
    #### When should I use a static nested class in Java?
    - Apart from being defined inside another class, a static nested class behaves just like a regular top-level class.  
    - It can define both static/non-static members and can only access other static members of it's enclosing class.  
    - Use static-nested classes when you are using the class in only one place but want to treat it as a regular class otherwise.
  ## inner class
    Any nested class that is not static is considered an inner class. Specifically, an inner class abides by the following rules:
    - can have any type of access modifier in its declaration (public, private, etc)
    - can access both static and non-static members of its parent class
    - can only define non-static members   
    #### When should I use an inner class in Java?
    Unlike the static nested class, an inner class is able to access both static/non-static members of it's enclosing parent class.  
    Use an inner class when you need to access the enclosing class's members, regardless of whether they are static/non-static.  
    An inner class requires its parent class to be instantiated before it can be used.
    There are two types of inner classes:  
    - ### Local class  
      These are inner classes defined inside a method or scope block. The same rules for inner classes apply to local classes, with the exception that they can't have access modifiers in its declaration.
      #### When should I use a local class in Java
      The need for a local class is similar to any inner class.  
      You want to use a local class when you need access to the parent class members (both static and non-static) but only need to use the class within a particular method.  
      Additionally, local classes allow you to modify and access the class constructor.
    - ### Anonymous class
      These are inner classes that are defined as part of an expression. The anonymous class allows you to declare and instantiate a class at the same time.  
      Unlike a local class, an anonymous class does not have a name assigned to it. 
      The same rules for inner classes apply to anonymous classes with the following exceptions:
      - can't have access modifiers in its declaration 
      - can't define constructors or extend/implement other classes or interfaces
      #### When should I use an anonymous class in Java?
      Use the anonymous class when you need functionality but not necessarily a separate entity
## Shadowing
  Members of an inner class having the same name as members of their enclosing class are said to "shadow" their enclosing counterparts.  
  This means you can't reference a shadowed declaration by the name itself.
