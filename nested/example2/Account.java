package nested.example2;

public class Account {
    static private int count = 0;
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;

        // 계좌 현황 정보 업데이트
        count++;
        StaticAccountStatus.lastOpener = owner;
        InnerAccountStatus.lastOpener = owner;
    }


    public static class StaticAccountStatus {
        static private String lastOpener;

        public static void showStatus() {
            System.out.println("현재 해당 상품은 총 " + count + " 만큼 개설 되었습니다");
            System.out.println("해당 상품을 마지막으로 개설한 사람은 " + lastOpener + " 입니다");
        }
    }

    public void showInnerStatus() {
        InnerAccountStatus status = new InnerAccountStatus();
        status.showStatus();
    }

    private class InnerAccountStatus {
        static private String lastOpener;

        private void showStatus() {
            System.out.println("현재 해당 상품은 총 " + count + " 만큼 개설 되었습니다");
            System.out.println("해당 상품을 마지막으로 개설한 사람은 " + lastOpener + " 입니다");
            System.out.println("해당 계좌의 소유쥬는 " + owner + " 이고, 잔고는 " + balance + " 입니다.");
        }
    }
}