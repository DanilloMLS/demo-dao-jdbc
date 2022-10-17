package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
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

        System.out.println("Teste 2: findById seller");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("Teste 3: fingAll");
        List<Seller> list2 = sellerDAO.findAll();
        for (Seller obj : list2) {
            System.out.println(obj);
        }

        System.out.println("Teste 4: seller insert");
        Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDAO.insert(seller2);
        System.out.println("Inserted! New id: " + seller2.getId());

        System.out.println("Teste 5: seller update");
        Seller seller3 = sellerDAO.findById(1);
        seller3.setName("Marta Waine");
        sellerDAO.update(seller3);
        System.out.println("Update completed");
    }
}
