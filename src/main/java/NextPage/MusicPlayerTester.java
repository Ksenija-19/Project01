package NextPage;

public class MusicPlayerTester {

    public static void main(String[] args) {
        MusicPlayer [] arr ={new CDPlayer("CD player",7),new StreamingPlayer("Streaming player",5),new MP3player("MP3",10)};
        for(MusicPlayer mp: arr){
            mp.pausa();
            mp.play();
            mp.stop();
        }
    }
}
