##Recap

Constructors and chaining

Types of Const

This keyword??
refers to current object

method overloading....

Stack??

Last in first out
---stack of plate

instances and methods are created in stack

Heap??

objects are created in heap

Garbage Collector??

constructor initializes the object.
C++ ,destructors
Garbage collection runs randomly 
and cleans the memory for any unallocated object.
Garbage collector removes the memory allocation for object who doesn't have refrence

freeCodeCamp--

mark and sweep

## Static Variable

Single copy
shared among the other instances of the class
memory allocation happens one

## Static methods

static methods can be accessed by different class under a static main method 
wuith just the class name .No need to make the object of the class.


## Static Class
nested class

class Test{
   static class MyTest{
}
}


## Static Block

static {

        System.out.println("static block");
    }

This static block will get executes first whenever the
class is called.If there is a default const then also this static block 
is loaded in the memory and executes first.


### 
Static block is called first.

Instace Block is called then constructor called.


