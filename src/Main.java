import Models.Entities.Department;
import Models.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department d = new Department(1, "Books");
        Seller s = new Seller(21, "Joao", "jao@gmail.com", new Date(), 3000.0, d);
        System.out.println(d);
        System.out.println(s);
    }
}