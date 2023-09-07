# Generics
- Check the type in compile time
- Simple example of code
  
  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    tvList.add(new Audio());   // compile error

- To catch a runtime error in advance, applied `Tv` objecte name into `ArrayList` so that compiler will detect the error of code prior to run it.

  ```java
    ArrayList<Tv> tvList = new ArrayList<Tv>();
    tvList.add(new Tv());
    Tv t = tvList.get(0);
    // TV t = (Tv) tvList.get(0);  not necessary to the type casting

- The type of reference variable should be equal to its constructor. For example,

  ```java
    ArrayList<Tv> list = new ArrayList<Tv>() ;  // OK
    ArrayList<Product> list = new ArrayList<Tv>() ;  // Error
  ```

- Polymorphism of generics
  ```java
    List<Tv> list = new ArrayList<Tv>() ;
    List<Tv> list = new LinkedList<tv>() ;
  ```
  List is the parent of ArrayList and LinkedList


- Another features of `Generics` in Java

   a. Iterator<E>
   
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

  b. `HashMap`

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
  > 
    

  
## Exception
- `Exception` is a run-time error. It consists of IOException, ClassNotFoundException, RuntimeException and so on.
- Inside `RuntimeException`, there are several errors such as `ArithmeticException, ClassCastExceoption,NullPointerException` and so on.


### References
[1. Java_Jaungsuk](https://www.youtube.com/watch?v=QcXLiwZPnJQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=135)
