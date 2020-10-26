/*package comcun;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Test {
    String resPath = "C:\\Users\\Cuney\\Labb6\\src\\Sounds\\";
    File f = new File(resPath);
    File[] result = f.listFiles();
    String[] filePath = new String[result.length];

    public void playSome() throws IOException, UnsupportedAudioFileException, LineUnavailableException, InterruptedException {
        for (int i = 0; i < result.length; i++) {
            filePath[i] = resPath  + result[i].getName();
        }

        for (String audioPath: filePath) {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(audioPath).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            while (!clip.isRunning())
                Thread.sleep(1000);
            while (clip.isRunning())
                Thread.sleep(1000);
            clip.close();
        }
    }

}

 */
