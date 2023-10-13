import Models.Dao.DaoFactory;
import Models.Dao.SellerDao;
import Models.Entities.Department;
import Models.Entities.Seller;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        // find by id
        System.out.println("Find by Id :");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        // find by department id
        System.out.println("Find by Department :");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller obj : sellers){
            System.out.println(seller);
        }
        System.out.println();

        // find by department id
        System.out.println("Find all :");
        List<Seller> sellers2 = sellerDao.findAll();
        for (Seller obj : sellers2){
            System.out.println(seller);
        }
        System.out.println();
    }
}