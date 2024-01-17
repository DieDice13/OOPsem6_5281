// 1) Переписать код в соответствии с Single Responsibility Principle:
package Task_1.SRP_solution;
import java.sql.Date;

public class App {
    public static void main(String[] args) {
        // Создаем экземпляр класса Employee
        Employee employee = new Employee("Иван", Date.valueOf("1995-07-21"), 100000);
        
        // Создаем экземпляр класса Accountant
        Accountant accountant = new Accountant("Анна", Date.valueOf("1990-01-01"), 120000);
        
        // Вызываем метод calculateNetSalary() для employee
        int netSalaryEmployee = accountant.calculateNetSalary(employee);
        System.out.println("Чистая зарплата сотрудника: " + netSalaryEmployee);
        
        // Вызываем метод calculateNetSalary() для accountant
        int netSalaryAccountant = accountant.calculateNetSalary(accountant);
        System.out.println("Чистая зарплата бухгалтера: " + netSalaryAccountant);
    }
}
