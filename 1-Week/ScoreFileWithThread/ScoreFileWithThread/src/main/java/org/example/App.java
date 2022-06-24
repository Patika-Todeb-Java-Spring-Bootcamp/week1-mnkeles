package org.example;

import org.example.consumer.Consumer;
import org.example.producer.Producer;


public class App 
{
    public static void main( String[] args )
    {
        /*  Producer producer=new Producer();
        Consumer consumer=new Consumer();

        consumer.start();
        producer.start();

         */
        Thread thread1=new Thread(new Consumer());
        Thread thread2=new Thread(new Producer());



        thread2.run();
        thread1.run();


    }
}
