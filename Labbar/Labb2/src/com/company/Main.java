package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int loop = 1;
        while (true) {


            Scanner txt = new Scanner(System.in);

            System.out.print("Search in a file: ");
            String search = txt.next();

            File myFiles = new File("C:\\Users\\test\\");
            FileInputStream fis= new FileInputStream ("test.txt");
            Scanner sc=new Scanner(fis);

            while (sc.hasNextLine()){
                System.out.print(sc.hasNextLine());
            }

            String[] fileList = myFiles.list();

            for (String name : fileList) {

                if (name.contains(search)) {
                    System.out.println(myFiles.getAbsolutePath() + "\\" + name);
                }

            }
        }
    }
}