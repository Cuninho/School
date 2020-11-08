package comcun;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangmanWordList implements WordList {

        List<String> words = new ArrayList<>();

        HangmanWordList(){
            try {
                Scanner sc = new Scanner(new File("src\\comcun\\wordlist.txt"));
                while(sc.hasNextLine()) {
                    words.add(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("FileNotFoundException: can't find the file...");
            }
        }

        public int getWordCount() {
            return words.size();
        }

        public String getWord(int index) {
            return words.get(index);
        }
    }







    /*
    public String getWord(int index) {
        Random r = new Random();
        int result = r.nextInt(10);
        return switch (result) {
            case 0 -> "KYH";
            case 1 -> "COMPUTER";
            case 2 -> "IOTDEVELOPER";
            case 3 -> "ABSTRACT";
            case 4 -> "INTERFACE";
            case 5 -> "SCRUM";
            case 6 -> "AGILE";
            case 7 -> "FOOTBALL";
            case 8 -> "MOVIE";
            case 9 -> "FUNNY";
            default -> new String("Illegal index");
        };
    }
}

     */