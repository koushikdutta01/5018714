import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }


    public void addEmployee(Employee employee) {
        if (count == employees.length) {
            employees = Arrays.copyOf(employees, employees.length * 2); // Resize array if full
        }
        employees[count++] = employee;
    }


    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }


    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }


    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null; // Decrease count and nullify the last element
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(3);

        Employee emp1 = new Employee("01", "Koushik Dutta", "Developer", 60000);
        Employee emp2 = new Employee("02", "Shantanu Gorai", "Manager", 80000);
        Employee emp3 = new Employee("03", "Nikhil Kumar", "Designer", 55000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch Employee 02:");
        Employee foundEmployee = ems.searchEmployee("02");
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee 02:");
        if (ems.deleteEmployee("02")) {
            System.out.println("Employee 02 deleted.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
