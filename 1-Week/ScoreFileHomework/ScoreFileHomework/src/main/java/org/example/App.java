package org.example;

import org.example.consumerProject.Consumer;
import org.example.producerProject.Producer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Producer producer=new Producer();
        producer.run();

        Consumer consumer=new Consumer();
        consumer.run();


    }
}
