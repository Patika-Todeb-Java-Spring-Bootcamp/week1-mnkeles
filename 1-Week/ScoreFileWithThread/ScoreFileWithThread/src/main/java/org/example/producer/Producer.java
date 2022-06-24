package org.example.producer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Producer extends  Thread {

    @Override
    public void run(){
        Scanner input=new Scanner(System.in);
        System.out.println("Maç skorunu aşağıdaki format ile tek satır halinde giriniz" +
                "\n1.Takım ?:? 2.Takım " +
                "\nMaç Sonucu -->");
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
