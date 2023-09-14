# Thread

## name.join()
  - wait until completing the previous process by `try - catch `


## Single Vs Multi thread
ex. Multi thread
  
  ```java
    class ThreadTest{
      public static void main(String args[]){
        MyThread1 th1 = new MyThread1 ();
        MyThread1 th2 = new MyThread2 ();
        th1.start();
        th2.start();
      }
    }

    class MyThread1 extends Thread {
      public void test1(){
        ...
      }
    }

    class MyThread2 extends Thread {
      public void test2(){
        ...
      }
    }
  ```

## Thread priority

## Daemon thread
- It supports main thread and it will end untill main thread will stop.
- `setDamon ()` call the method of daemon thread
- `boolean autoSave` declared as static boolean
- By implements `runnable` interface, the method will run infinite loop

```java
  class daemonThread implements Runnable {
    static boolean autoSave = false ;

    public static void main(String[] args) {
      Thread t = new Thread(new daemonThread());
      t.setDaemon(true);
      t.start();

    for(int i=`; i<= 10; i++) {
      try {  Thread.sleep(1000);  }
      catch (InterruptedException e) {}
      System.out.println(i);

      if(i==5) autoSave = true ;
    }
  System.out.println("~");
  }

  public void run() {
    while(true) {    // infinite loop
      try {
        Thread.sleep(3*1000);
      } catch (InterruptedException e) {}

    if(autoSave) autoSave();
    }
  }
  ```
