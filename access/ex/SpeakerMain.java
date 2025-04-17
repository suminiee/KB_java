package access.ex;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker s = new Speaker();

        s.volumeUp();
        s.powerOff();
        s.powerOn();
        s.volumeDown();
        s.volumeUp();
        s.volumeUp();
        s.volumeDown();
        s.powerOn();
        s.powerOff();
    }
}
