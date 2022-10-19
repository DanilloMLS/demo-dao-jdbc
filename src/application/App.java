package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*SellerDAO sellerDAO = DAOFactory.createSellerDAO();

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
        System.out.println("Delete completed");*/

        DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();

        System.out.println("Teste 1: department findById");
        System.out.println("Enter department id: ");
        int id = sc.nextInt();
        Department department = departmentDAO.findById(id);
        System.out.println(department);
        sc.nextLine();

        System.out.println("Teste 2: department findAll");
        List<Department> list = departmentDAO.findAll();
        for (Department department2 : list) {
            System.out.println(department2);
        }

        System.out.println("Teste 3: department insert");
        System.out.println("Enter department name: ");
        String name = sc.nextLine();
        Department department2 = new Department(null, name);
        departmentDAO.insert(department2);
        System.out.println("Inserted! New id: " + department2.getId());

        System.out.println("Teste 4: department update");
        System.out.println("Enter dept. Id: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter dept. new name: ");
        String name2 = sc.nextLine();
        Department department3 = new Department(id2, name2);
        departmentDAO.update(department3);
        System.out.println("Update completed");

        System.out.println("Teste 4: department delete");
        System.out.println("Enter dept. Id: ");
        int id3 = sc.nextInt();
        sc.nextLine();
        departmentDAO.deleteById(id3);
        System.out.println("Delete completed");

        sc.close();
    }
}
