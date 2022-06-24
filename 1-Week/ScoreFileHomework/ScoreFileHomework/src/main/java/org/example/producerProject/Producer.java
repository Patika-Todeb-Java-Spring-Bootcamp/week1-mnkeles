package org.example.producerProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Producer {

    public void run(){
        Scanner input=new Scanner(System.in);
        System.out.println("Maç skorunu aşağıdaki format ile tek satır halinde giriniz" +
                "\n1.Takım ?:? 2.Takım ");


        String data= input.nextLine();

        try {
            FileWriter writerFile=new FileWriter("src/main/java/org/example/score.txt",true);
            BufferedWriter buffWriter=new BufferedWriter(writerFile);
            buffWriter.newLine();
            buffWriter.write(data);
            buffWriter.close();
            writerFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
