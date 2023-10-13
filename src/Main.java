import Models.Dao.DaoFactory;
import Models.Dao.SellerDao;
import Models.Entities.Seller;


public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}