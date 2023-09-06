# Generics
- check the type in compile time
- simple example of code
  
  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    tvList.add(new Audio());   // compile error

- to catch a runtime error in advance, applied `Tv` objecte name into `ArrayList` so that compiler will detect the error of code prior to run it.

  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    Tv t = tvList.get(0);
    // TV t = (Tv) tvList.get(0);  not necessaryl to the type casting

## Exception
- `Exception` is a run-time error. It consists of IOException, ClassNotFoundException, RuntimeException and so on.
- Inside `RuntimeException`, there are several errors such as `ArithmeticException, ClassCastExceoption,NullPointerException` and so on.


### References
[1] https://www.youtube.com/watch?v=QcXLiwZPnJQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=135
