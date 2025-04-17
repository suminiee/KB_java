package access;

public class AccountRefectorMain {
    public static void main(String[] args) {
        AccountRefector account = new AccountRefector(1000, "국민은행", "VIP", "강수민");

        // public 필드에 접근
        System.out.println("public 접근제어자 확인");
        System.out.println("은행명은? : " + account.bank);

        //default 필드에 접근
        System.out.println("default 접근제어자 확인");
        System.out.println("등급은? : " + account.grade);

        //private 필드에 접근
        System.out.println("private 접근제어자 확인");
        System.out.println("이름은? : " + account.getName());
        System.out.println("잔고는? : " + account.getTotal());
    }
}
