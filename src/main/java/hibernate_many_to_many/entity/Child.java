package hibernate_many_to_many.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int childId;

    @Column(name = "name")
    private String childName;

    @Column(name = "age")
    private int age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sectionsList;

    public void addSectionToChild(Section... sections) {
        if (sectionsList == null) {
            sectionsList = new ArrayList<>();
        }
        sectionsList.addAll(Arrays.asList(sections));
    }

    public Child() {
    }

    public Child(String name, int age) {
        this.childName = name;
        this.age = age;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int id) {
        this.childId = id;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Section> getSectionsList() {
        return sectionsList;
    }

    public void setSectionsList(List<Section> sectionList) {
        this.sectionsList = sectionList;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + childId +
                ", name='" + childName + '\'' +
                ", age=" + age +
                '}';
    }
}
