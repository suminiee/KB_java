package generic.ex2;

public class StrictGenericBox<Type> {
    private Type  value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        if (value instanceof String) {
            System.out.println("전달받은 값이 String이 맞습니다. 값을 저장합니다.");
            this.value = value;
        }
        else if (value instanceof Integer)  {
            System.out.println("전달받은 값이 Integer가 맞습니다. 값을 저장합니다.");
            this.value = value;
        }
        else if (value instanceof Long) {
            System.out.println("전달받은 값이 Long이 맞습니다. 값을 저장합니다.");
            this.value = value;
        } else {
            System.out.println("전달 받은 값이 String / Integer / Long 이 아닙니다");
        }
    }
}
