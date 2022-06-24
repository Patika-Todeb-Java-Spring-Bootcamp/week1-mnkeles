package org.example.consumerProject;

import java.io.BufferedReader;
import java.io.FileReader;

public class Consumer {
    public  void run(){
        try {
            FileReader readFile = new FileReader("src/main/java/org/example/score.txt");
            BufferedReader buffRead = new BufferedReader(readFile);
            String line;
            while ((line = buffRead.readLine()) != null) {
                System.out.println(line);

            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
