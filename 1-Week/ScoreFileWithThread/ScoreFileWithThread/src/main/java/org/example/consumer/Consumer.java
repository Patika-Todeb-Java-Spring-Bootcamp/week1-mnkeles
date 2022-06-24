package org.example.consumer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Consumer extends  Thread {

    @Override
    public  void run(){
        try {
            FileReader readFile = new FileReader("src/main/java/org/example/score.txt");
            BufferedReader buffRead = new BufferedReader(readFile);
            String line;
            while ((line = buffRead.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(1L * 1000L);
                //score.txt dosyasındaki veriler 1 saniye aralıklarla ekrana yazaılcaktır
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
