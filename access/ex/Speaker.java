package access.ex;

public class Speaker {
    private boolean power;
    private int volume;
    public void powerOn() {
        if (!power) {
            power = true;
            System.out.println("전원을 켭니다");
        } else {
            System.out.println("이미 전원이 켜져 있습니다.");
        }
    }

    public void powerOff() {
        if (power) {
            power = false;
            System.out.println("전원을 끕니다");
        } else {
            System.out.println("전원을 먼저 켜야 합니다.");
        }
    }

    public void volumeUp() {
        if (power) {
            if (volume < 100) {
                volume++;
                System.out.println("현재 볼륨 : " + volume);
            } else {
                System.out.println("더이상 볼륨을 올릴 수 없습니다.");
            }

        } else {
            System.out.println("전원을 먼저 켜주세요");
        }
    }

    public void volumeDown() {
        if (power) {
            if (volume > 0) {
                volume--;
                System.out.println("현재 볼륨 : " + volume);
            } else {
                System.out.println("더이상 볼륨을 낮출 수 없습니다.");
            }

        } else {
            System.out.println("전원을 먼저 켜주세요");
        }
    }
}
