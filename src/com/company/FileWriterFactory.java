package com.company;


public class FileWriterFactory {

    public static FileWriter getWriter(FileTypes types) {
        FileWriter writer = null;
        switch (types) {
            case TXT:
                writer = new TxtWriter();
                System.out.println("TXT file was successfully created!");
                break;
            case DOC:
                writer = new DocWriter();
                System.out.println("DOC file was successfully created!");
                break;
            case RTF:
                writer = new RtfWriter();
                System.out.println("RTF file was successfully created!");
                break;
        }
        return writer;
    }
}
