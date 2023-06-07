package pro.sky.KL;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class EmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static int counter = 10;
    List<Employee> employee = new ArrayList<>(List.of());

    public Employee createNewEmployee() {
        System.out.println("фамилия ");
        String newLastName = scanner.nextLine();
        System.out.println("имя ");
        String newFirstName = scanner.nextLine();
        Employee employee = new Employee(newLastName, newFirstName);
        return employee;
    }

    public void addNewEmployee(Employee newEmployee) {
        if (!employee.equals(0) & employee.size() < 10) {
            employee.add(newEmployee);
            System.out.println("Работник добавлен под индексом "
                    + employee.size());
        }
    }

    public void delEmployee(int num) {
        employee.remove(num);
        System.out.println("Работник с индексом " + num + " удален");
    }

    public Employee findEmloyee(List<Employee> employee, int i) {
        if (i <= employee.size()) {
            return employee.get(i);
        } else {
            System.out.println("индекс больше длины массива");
            return null;
        }
    }
}
