package com.Hospital_management_application.hospital_managment_application.Multithreading;



class MyThread2 extends Thread {

    public void run(){

        while(1>0){
            System.out.println("I am in 2ND thread");
        }

    }
}

class MyThread3 implements Runnable{

    public void run() {

        System.out.println("Sleeping a thread for 10 second");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread woke up");
        System.out.println("Implemented using an interface ");

    }
}

class MyThread extends Thread {

    public void run() {
        //This run method is acting like a main method
        while (1 > 0) {
            System.out.println("I am inside MyThread execution ");
        }
    }
}

public class Multithreading {

    public static void main(String[] args) throws InterruptedException {

//        MyThread thread = new MyThread();
//        thread.start();
//
//        MyThread2 thread2 = new MyThread2();
//        thread2.start();

        Thread thread3 = new Thread(new MyThread3());
        thread3.start();

        thread3.isAlive(); //living or dead

        thread3.join(); //Killing the thread


//        while(1>0){
//            System.out.println("I am in the main thread class ");
//        }




    }
}
