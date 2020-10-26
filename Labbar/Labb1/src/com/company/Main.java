package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {

            if (i == 42) {
                System.out.println("Answer to the Ultimate Question of Life, the Universe and Everything");

            } else if (i % 5  == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }              // av Gustav och Cuneyt
}
// Gustav & Cuneyt


// While loop lösningen finns nedan;
//-----------------------------------------


/*package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 1;

        while (i < 100){

            if (i == 42) {
                System.out.println("Answer to the Ultimate Question of Life, the Universe and Everything");
                i++;


            } else if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
                i++;


            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                i++;


            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                i++;

            } else {
                System.out.println(i);
                i++;
            }




        }
    }
}

 */
