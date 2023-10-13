package Models.Dao;

import Models.Dao.impl.SellerDaoJDBC;
import db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConn());
    }
}
