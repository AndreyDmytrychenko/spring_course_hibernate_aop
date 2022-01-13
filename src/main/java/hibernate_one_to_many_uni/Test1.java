package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;


        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp1 = new Employee("Zaur", "Tregulov", 2100);
//            Employee emp2 = new Employee("Anton", "Ivanov", 1200);
//            Department department = new Department("IT", 2900, 200);
//
//            department.addEmployeeToDepartment(emp1,emp2);
//            session.save(department);

//           Department dep = session.get(Department.class, 2);
//           session.delete(dep);

            session.createQuery("delete Department where id in(1)").executeUpdate();

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
