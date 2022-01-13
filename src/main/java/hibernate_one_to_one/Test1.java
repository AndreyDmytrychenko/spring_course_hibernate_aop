package hibernate_one_to_one;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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

//            Employee emp1 = new Employee("Anton", "Petrov", 1000);
//            Employee emp2 = new Employee("Sonya", "Dorosh", 1200);
//
//            Department department = new Department("IT", 3000, 400);
//
//            department.addEmployeeToDepartment(emp1, emp2);

//            session.save(department);

//            Department department = session.get(Department.class, 1);
//
//            for (Employee emp : department.getEmps()) {
//                System.out.println(emp);
//            }

//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
