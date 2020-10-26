package comcun;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class PlayList {
    Clip clip = AudioSystem.getClip();
    Scanner sc = new Scanner(System.in);

    PlayList() throws LineUnavailableException {
        files();

    }
    private String[] files() {
        String fileDirectory = "C:\\Users\\Cuney\\comcunPackage\\Labb6\\src\\Sounds\\";
        File f = new File(fileDirectory);
        File[] fileList = f.listFiles();
        String[] filePath = new String[fileList.length];

        for (int i = 0; i < fileList.length; i++) {
            filePath[i] = fileDirectory + fileList[i].getName();
        }
        return filePath;
    }


    void playIt() {
        try {
            songs();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void songs() throws IOException, LineUnavailableException, UnsupportedAudioFileException, InterruptedException {
        for (String audioPath : files()) {
            if (sc.next().equals("y")) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(audioPath).getAbsoluteFile());
                clip.open(audioInput);
                clip.start();
                Thread.sleep(1000);
                clip.close();
            }
        }
    }
}