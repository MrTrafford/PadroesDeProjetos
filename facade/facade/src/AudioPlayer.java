import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class AudioPlayer {

    private FileInputStream arquivoAudio;
    private Player player;

    public void tocar(String caminho) {
        try {
            arquivoAudio = new FileInputStream(caminho);
            player = new Player(arquivoAudio);

            System.out.println("Tocando música...");
            player.play();

        } catch (Exception e) {
            System.out.println("Erro ao tocar o áudio.");
        }
    }
}
