package lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("조승연");
        ImmutableUser user2 = user1;

        System.out.println("user1 : " + user1.toString());
        System.out.println("user2 : " + user2.toString());

        user2 = new ImmutableUser("이재현");
        System.out.println("user2의 이름을 '이재현'으로 변경");

        System.out.println("user1 : " + user1.toString());
        System.out.println("user2 : " + user2.toString());
    }
}
