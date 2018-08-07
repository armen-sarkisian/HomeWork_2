package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int checker = 0;
        FileWriter writer;
        System.out.println("Current text will be saved in a textfile. Please type file extension... (txt/doc/rtf)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        try {
            while (checker==0) {
                str = br.readLine();
                    switch (str) {
                        case "txt":
                            writer = FileWriterFactory.getWriter(FileTypes.TXT);
                            checker = 1;
                            break;
                        case "doc":
                            writer = FileWriterFactory.getWriter(FileTypes.DOC);
                            checker = 1;
                            break;
                        case "rtf":
                            writer = FileWriterFactory.getWriter(FileTypes.RTF);
                            checker = 1;
                            break;
                        default:
                            System.out.println("You have typed wrong file extension! Please type again...");
                            break;
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


