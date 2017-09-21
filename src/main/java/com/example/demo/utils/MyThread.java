package com.example.demo.utils;

/**
 * Created by Tony on 2017/9/13.
 * com.example.demo.utils.SpringBootMybatis
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i =0 ; i <= 100 ; i ++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    /*@Override
    public synchronized void start() {
        System.out.println("----------start()-----------");
    }*/

    public static void main(String[] args) {
       for (int i = 0 ; i < 100 ; i++){
           System.out.println(Thread.currentThread().getName() + " " + i);
           if (i == 30){
               Runnable myRunnable = new MyThread();
               Thread thread = new Thread(myRunnable);
               Thread thread1 = new Thread(myRunnable);

               thread.start();
               thread1.start();
           }
       }
    }
}
