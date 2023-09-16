# Lambda and Interface

## Functional interface
- Functional interface has a only one abstract method
```java
interface MyFunction {
  public abstract int max(int a , int b) ;
}
...
// declare class and create object at the same time
MyFunction f = new MyFunction() {
  public int max(int a , int b) {
    return a> ? a: b ;
  }
};

...

int value = f.max(3,5) ;
```
