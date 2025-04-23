package lang.immutable;

public class ImmutableUser {
    private final String name; //final은 최초 값을 한번만 받을 수 있고 그 이후에는 변경이 불가능하다.

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}
