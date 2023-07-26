package ticketthing;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Plane extends company{

    private @Id @GeneratedValue Long id;
    private String name;
    private Company company;
    private String start;
    private String destination;

    Plane() {}

    Plane(String name, <T> company, String start, String destination) {

        this.name = name;
        this.company = company;
        this.destination = destination;
        this.start = start;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public <T> getCompany() {
        return this.company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Company company) {
        this.company = company;
    }

    /*@Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }*/
}