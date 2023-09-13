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


