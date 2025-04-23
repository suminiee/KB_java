package lang.object;

public class EqualsMain {
    public static void main(String[] args) {
        User user1 = new User("가나다", "asdf");
        User user2 = new User("가나다", "asdf");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
