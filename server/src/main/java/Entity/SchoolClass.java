package Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class SchoolClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolClassId;
    private String className;
    @ManyToOne
    Student student;

   public SchoolClass() {
    }

    public SchoolClass(Long schoolClassId, String className, Student student) {
        this.schoolClassId = schoolClassId;
        this.className = className;
        this.student = student;
    }

    public Long getSchoolClassId() {
        return schoolClassId;
    }

    public void setSchoolClassId(Long schoolClassId) {
        this.schoolClassId = schoolClassId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolClass)) return false;
        SchoolClass that = (SchoolClass) o;
        return Objects.equals(schoolClassId, that.schoolClassId) && Objects.equals(className, that.className) && Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolClassId, className, student);
    }
}
