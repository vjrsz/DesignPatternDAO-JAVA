import Models.Dao.DaoFactory;
import Models.Dao.SellerDao;
import Models.Entities.Department;
import Models.Entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department d = new Department(1, "Books");
        Seller s = new Seller(21, "Joao", "jao@gmail.com", new Date(), 3000.0, d);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(d);
        System.out.println(s);
    }
}