package NextPage;

/*Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(),
and fields such as currentTrack and volume.
 Implement subclasses for different types of music players,
 like MP3Player, CDPlayer, and StreamingPlayer,
 each with their unique implementations of the play() method
  (e.g., streaming from the internet, playing from a CD).}
 */

public abstract class MusicPlayer {

    String currentTrack;
    int volume;
    public abstract void play();

    public MusicPlayer(String currentTrack,int volume){
        this.currentTrack=currentTrack;
        this.volume=volume;
    }
    public abstract void pausa();

    public  abstract void stop();

    }

class MP3player extends MusicPlayer{

    public MP3player(String currentTruck,int volume){
        super(currentTruck,volume);
    }
    public void play(){
        System.out.println("Play music");
    }
    public void pausa(){
        System.out.println("Pause music");
    }
    public void stop(){
        System.out.println("Stop");
    }
}
class CDPlayer extends MusicPlayer{
    public CDPlayer(String currentTrack,int volume){
        super(currentTrack,volume);
    }
    public void play(){
        System.out.println("Play movie");
    }
    public void pausa(){
        System.out.println("Pause movie");
    }

    @Override
    public void stop() {

    }
}
class StreamingPlayer extends MusicPlayer{
    public StreamingPlayer(String currentTrack,int volume){
        super(currentTrack, volume);
    }
    @Override
    public void play(){
        System.out.println("just play something");
    }
    @Override
    public void pausa(){
        System.out.println("Just paused");
    }

    @Override
    public void stop() {

    }
}