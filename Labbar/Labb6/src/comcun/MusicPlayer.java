package comcun;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.FileHandler;

public class MusicPlayer {



    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, LineUnavailableException, IOException {
        PlayList myMusicObject = new PlayList();
        myMusicObject.playIt();
        //Test t = new Test();
        //t.playSome();
    }
}