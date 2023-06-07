package pro.sky.KL;

import java.util.Objects;

public class Employee {
    {

    }

    private String lastName;
    private String firstName;

    public Employee(String LastName, String FirstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return lastName.equals(employee.lastName) && firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}

