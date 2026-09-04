import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class App {
 public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.tocar(
            "C:\\Users\\tiago.dantas\\Downloads\\teste.mp3"
        );
    }
}
