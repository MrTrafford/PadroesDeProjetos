import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String caminho ="C:\\Users\\tiago.dantas\\Downloads\\teste.mp3";
         FileInputStream arquivoAudio;
         Player player;
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
