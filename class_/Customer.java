package class_;

public class Customer {
    String name;
    int age;
    int total;
    boolean isBlackList;

    Customer (String name, int age, int total, boolean blackList) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.isBlackList = blackList;
    }

    Customer () {
        this.name = "아직몰라요";
        this.age = 0;
        this.total = 0;
        this.isBlackList = false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", total=" + total +
                ", isBlackList=" + isBlackList +
                '}';
    }
}
