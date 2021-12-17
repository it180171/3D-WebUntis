package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String className;

    @ManyToOne
    Subject subject;

    @ManyToOne
    Person person;

    public Teacher() {
    }

    public Teacher(Long id, String className, Subject subject, Person person) {
        this.id = id;
        this.className = className;
        this.subject = subject;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(className, teacher.className) && Objects.equals(person, teacher.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, className, person);
    }
}
