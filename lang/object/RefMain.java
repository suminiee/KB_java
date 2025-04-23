package lang.object;

public class RefMain {
    public static void main(String[] args) {
        User2 user1 = new User2("조승연");
        User2 user2 = user1;

        System.out.println("user1 : " + user1.toString());
        System.out.println("user2 : " + user2.toString());

        user2.setName("이재현");
        System.out.println("user2의 이름을 '이재현'으로 변경");
        System.out.println("삼성의 ヽ꒰(•̀ᗝ•́๑)꒱> 이재현 ヽ꒰(๑•̀ᗝ•́)꒱ノ 빼뱀뺌빼배뱀 안타! ꒰(っ(ｪ)-)꒱っ˗ˋˏ빼뱀ˎˊ˗");
        System.out.println("최강꒰(ง ᵕᴗᵕ)꒱ว 삼성꒰(ง ᵕᴗᵕ)꒱ว 히어로꒰(ง ᵕᴗᵕ)꒱ว 누구!! 김영웅 ꒰(ノ⁾⁾˙∇˙)꒱ノ⁾⁾ 승리의꒰(ง ᵕᴗᵕ)꒱ว " +
                "안타를꒰(ง ᵕᴗᵕ)꒱ว 날려라꒰(ノ⁾⁾˙∇˙)꒱ノ⁾⁾꒰(ノ⁾⁾˙∇˙)꒱ノ⁾⁾ 워오오오오오꒰(ง ᵕᴗᵕ)꒱ว꒰(ง ᵕᴗᵕ)꒱ว");
        System.out.println("⸜꒰(•̤̀ᵕ•̤́๑)꒱삼성의 ꒰(๑•̤̀ᵕ•̤́)꒱⸝김지찬 ╭꒰(•̤̀ᵕ•̤́๑)꒱안타를 ꒰(๑•̤̀ᵕ•̤́)꒱⸝날려라 ⸜꒰(•̤̀ᵕ•̤́๑)꒱삼성의 ꒰(๑•̤̀ᵕ•̤́)꒱⸝김지찬 ˗ˋˏ찬찬찬ˎˊ˗ ⸜꒰(๑•̤̀ᵕ•̤́๑)꒱⸝김지찬");
        System.out.println("user1 : " + user1.toString());
        System.out.println("user2 : " + user2.toString());
    }
}
