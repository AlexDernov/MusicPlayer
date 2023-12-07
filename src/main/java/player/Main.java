package player;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();
        Playable music1 = new MusicPlayer();
        Playable video2 = new VideoPlayer();
        //oder
        MusicPlayer music = new MusicPlayer();
        VideoPlayer video = new VideoPlayer();
        mediaController.playMedia(music1);
        mediaController.playMedia(video2);
    }
}
