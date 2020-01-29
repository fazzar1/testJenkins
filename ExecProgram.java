package com.capgemini.demo;

public class ExecProgram {

    public static void main (String[] args) {

        Program prog = new Program();

        try {
            prog.addNode("C:\\Users\\nahmediz\\Desktop\\demo.xml", "Neye");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
