package comcun;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HangmanGuiTest {

        @Test
        public void getTotalWords() {
            HangmanWordList list = new HangmanWordList();
            list.getWordCount();
            assertEquals(10, list.getWordCount());
        }

        @Test
        public void getWordFromList() {
            HangmanWordList list = new HangmanWordList();
            list.getWordCount();
            assertEquals("MOVIE", list.getWord(8));
        }

        @Test
        public void numbersOfGuesses(){
            HangmanGui hangman = new HangmanGui();
            assertEquals(8, hangman.getNumOfGuess());
        }
    }
