package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        // Department department = new Department(1, "books");
        // System.out.println(department);

        // Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, department);
        // System.out.println(seller);

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println("Teste 1: findById seller");
        Seller seller = sellerDAO.findById(3);
        System.out.println(seller);
    }
}
