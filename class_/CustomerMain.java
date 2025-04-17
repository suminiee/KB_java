package class_;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer("강수민", 23, 10000, true);
        System.out.println(c);

        Customer c2 = new Customer();
        System.out.println(c2);
    }
}
