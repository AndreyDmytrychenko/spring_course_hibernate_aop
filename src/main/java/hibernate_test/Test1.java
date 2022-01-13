package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Sveta", "Ivanova", "Sales", 96000);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            Session session1 = factory.getCurrentSession();
            session1.beginTransaction();
            Employee employee = session1.get(Employee.class, emp.getId());
            System.out.println(employee);
            session1.getTransaction().commit();


        } finally {
            factory.close();
        }
    }




}
