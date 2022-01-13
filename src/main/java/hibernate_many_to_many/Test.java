package hibernate_many_to_many;


import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;


        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Football");
//
//            Child child1 = new Child("Egor", 8);
//            Child child2 = new Child("Masha", 9);
//            Child child3 = new Child("Tolik", 6);
//
//            section1.addChildToSection(child1, child2, child3);
//*******************************************************************

//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Math");
//            Section section3 = new Section("Logic");
//
//            Child child = new Child("Sasha", 10);
//
//            child.addSectionToChild(section1, section2, section3);
// *******************************************************************

            session.beginTransaction();

            Section section = session.get(Section.class, 1);

            System.out.println(section);
            System.out.println(section.getChildrenList());



            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }


}
