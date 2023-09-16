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
