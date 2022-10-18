package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
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

        System.out.println("Teste 6: seller delete");
        System.out.println("Enter seller id: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.println("Delete completed");
    }
}
