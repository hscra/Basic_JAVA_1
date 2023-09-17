# Lambda and Interface

## Functional interface
- Functional interface has a only one abstract method
```java
@FunctionalInterface
interface MyFunction {
  public abstract int max(int a , int b) ;
}

...
// declare class and create object at the same time
MyFunction f = new MyFunction() {
  public int max(int a , int b) {
    return a > b ? a: b ;
  }
};

// MyFunction f = (a,b) -> a>b ? a: b ;  simple code by lambda

...

int value = f.max(3,5) ;
```
- functional interface parameters

```java

@FunctinoalInterface
interface MyFunction {
  void myMethod();
}

void aMethod(MyFunction f){
  f.myMethod();
}

MyFunction f = () -> System.out.println("myMethod()");
aMethod(f);
```

- retrun functional interface

```java
MyFunction myMethod() {
  MyFunction f = () -> {} ;
  return f;
}
```
  
## Method reference 

1. static method reference

```java
Integer method(String a) {
  return Integer.parseInt(s);
}
```



   
2. instance method reference
