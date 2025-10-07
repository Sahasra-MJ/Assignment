package Day4;

interface Playable{
    void play();
    void pause();
}
class AudioPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Audio is playing");
    }
    @Override
    public void pause() {
        System.out.println("Audio is paused");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Video is playing");
    }
    @Override
    public void pause() {
        System.out.println("Video is paused");
    }
}

public class PlayableMedia {
    public static void main(String[] args) {
        Playable p=new AudioPlayer();
        p.play();
        p.pause();
        System.out.println("---------------");
        VideoPlayer p1=new VideoPlayer();
        p1.play();
        p1.pause();
    }
}
