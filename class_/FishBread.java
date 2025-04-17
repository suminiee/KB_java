package class_;

import java.util.Date;

public class FishBread {
    String taste = "팥";
    String shape = "붕어";
    int price = 700;
    Date makeTime = new Date();

    @Override
    public String toString() {
        return "FishBread{" +
                "taste='" + taste + '\'' +
                ", shape='" + shape + '\'' +
                ", price=" + price +
                ", makeTime=" + makeTime +
                '}';
    }

}


