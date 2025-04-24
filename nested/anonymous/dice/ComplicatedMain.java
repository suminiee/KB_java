package nested.anonymous.dice;

import java.util.Random;

public class ComplicatedMain {
    public static void complicatedProgram( /* 외부로 코드 덩어리 받아오기 */ Dice dice ) {
        System.out.println("프로그램 시작 작업");
        //받아온 코드를 실행
        dice.run();

        System.out.println("프로그램 종료 작업");
    }



    public static void main(String[] args) {
        class DiceProgram implements Dice {
            @Override
            public void run() {
                int rand = new Random().nextInt(6)+1;
                System.out.println("주사위의 값은 : " + rand);
            }
        }

        complicatedProgram(new DiceProgram());
    }
}
