package poly2.casting;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();

        //아래는 서로 동일한 코드 -> 생략이 가능함(문제가 없다!) / 업캐스팅은 생략이 된다.
//        Parent parent1 = child;
//        Parent parent2 = (Parent) child;

        //1번 코드
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        //2번 코드 -> ClassCastException 발생
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();

    }
}
