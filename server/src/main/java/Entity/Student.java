package Entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Person person;

    @ManyToOne
    Absent absent;

    public Student() {
    }

    public Student(Long id, Person person, Absent absent) {
        this.id = id;
        this.person = person;
        this.absent = absent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Absent getAbsent() {
        return absent;
    }

    public void setAbsent(Absent absent) {
        this.absent = absent;
    }
}
