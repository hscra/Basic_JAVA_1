# Generics
1. Check the type in compile time <br>
a. Simple example of code
  
  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    tvList.add(new Audio());   // compile error
  ```

2. To catch a runtime error in advance, applied `Tv` objecte name into `ArrayList` so that compiler will detect the error of code prior to run it.<br>

  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    Tv t = tvList.get(0);
    // TV t = (Tv) tvList.get(0);  not necessary to the type casting
  ```

3. The type of reference variable should be equal to its constructor. For example,

  ```java
    ArrayList<Tv> list = new ArrayList<Tv>() ;  // OK
    ArrayList<Product> list = new ArrayList<Tv>() ;  // Error
  ```

4. Polymorphism of generics
  ```java
    List<Tv> list = new ArrayList<Tv>() ;
    List<Tv> list = new LinkedList<tv>() ;
  ```
  - List is the parent of ArrayList and LinkedList


5. Another features of `Generics` in Java

    a. Iterator<E><pr>
   
   
```java
    public interface Iterator<E> {
      boolean hasNext();
      E next();
      void remove();
    }
        ...
    
    Iterator <Student> it = list.itrator() ;
    while(it.hasNext()){
      Student s = it.next() ;  // (Student)it.next() is not required to transfer the type
    }
```  

</pr>
   b. HashMap
   
      HashMap<String, Student> map = new HashMap<String, Student>() ;   // new HashMap<> () is possible.
    
  
   ```java
      public class HashMap extends AbstractMap {
        ...
        public Student get(Object key) { ... }
        public Student put(String key, Student value) { ... }
        public Student remove(Object kye) { ... }
        ...
      }
   ```

> For HashMap <Key, Value> , it applies diferent types in `<>`
  

- By `extends` , java can assign the type from parent to children types.
- For example,

  ```java
    class FruitBox< T extends Fruit > {
      ArrayList<T> list = new ArrayList<T> () ;
      ...
    }

    FruitBox<Apple> appleBox = new FruitBox<Apple>() ;    // Allowed
    FruitBox<Toy>  toyBox = new FruitBox<Toy>() ;    // Error

    interface Eatable {}
    class FruitBox<T extends Eatable> { ... }
  ```

  
## Exception
- `Exception` is a run-time error. It consists of IOException, ClassNotFoundException, RuntimeException and so on.
- Inside `RuntimeException`, there are several errors such as `ArithmeticException, ClassCastExceoption,NullPointerException` and so on.


### References
[1. Java_Jaungsuk](https://www.youtube.com/watch?v=QcXLiwZPnJQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=135)
