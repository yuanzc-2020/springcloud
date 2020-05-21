package com.yuan;

import org.junit.Test;

import java.io.File;

public class TestMore {
    @Test
    public  void m(){
        File f = new File("D://softwaremain//consul");
        for (File s: f.listFiles()
             ) {
            if (s.isDirectory()){

                System.out.println(s.getName());
            }
        }
    }
    @Test
    public void method(){
        TestRunable t = new TestRunable();
        TestRunable t2 = new TestRunable();
        for(int a = 10;a>0;a--){
            new Thread(t).start();
            new Thread(t).start();
        }

    }
}
class Ticket{
    private int num = 300;

    public synchronized void sales(){
        if(num>0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ num-- +"张票，"+"剩余"+num+"张票");
        }
    }
}
 class Adomate{
     public static void main(String[] args) {
         Ticket ticket = new Ticket();
         new Thread(()->{
             for(int i=0;i<100;i++){
                 ticket.sales();
             }
         },"A").start();
         new Thread(()->{
             for(int i=0;i<100;i++){
                 ticket.sales();
             }
         },"B").start();
         new Thread(()->{
             for(int i=0;i<100;i++){
                 ticket.sales();
             }
         },"C").start();
     }

        }
