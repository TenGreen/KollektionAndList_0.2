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
        int i = 0;
        while (true) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
                System.out.println("Работник добавлен под индексом " + i);
                return;
            } else {
                i++;
            }
            if (i == 10) {
                throw new RuntimeException("В массиве нет свободных мест");
            }
        }
    }
}
